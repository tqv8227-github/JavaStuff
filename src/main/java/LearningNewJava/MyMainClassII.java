package LearningNewJava;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class MyMainClassII {

	public MyMainClassII() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// add two int...
		System.out.println("This is Java 8");
		int myInt = 79;
		String myStr = String.valueOf(myInt);
		String[] strArry = myStr.split("");
		int newResult = Integer.parseInt(strArry[0])+Integer.parseInt(strArry[1]);
		System.out.println("new Result: "+newResult);
		//////////////////////////////////////////////////////////////////
		
//		ICompareInt compareInt = (a,b)->{return a.compareTo(b);};
//		System.out.printf("is %d > %d: %s \n",7,6,compareInt.compare(7,6));
		////////////////////////////////////////////////////////////
		int iList[] = new int[] {10,3,20,1,5};
		Integer[] intlist = Arrays.stream(iList).boxed().toArray(Integer[]::new);  // convert from int[] to Integer[]
		//Integer intlist[] = new Integer[] {10,3,20,1,5};
		//System.out.printf("before sorted %s \n", intlist.toString());
		Arrays.asList(intlist).forEach(a->System.out.printf("before sorted using lambda %d \n", a));
		
		Arrays.sort(intlist);
		//System.out.printf("after sorted ascending order %s \n", intlist.toString());
		Arrays.asList(intlist).forEach(a->System.out.printf("after sorted ascending order %d \n", a));
		Arrays.sort(intlist, Collections.reverseOrder());
		//Collections.reverse(Arrays.asList(intlist));
		//System.out.printf("after sorted reverse order %s \n", intlist.toString());
		Arrays.asList(intlist).forEach(a->System.out.printf("after sorted descending order %d \n", a));
		
		iList = Arrays.asList(intlist).stream().mapToInt(i->i).toArray();  // convert from Integer[] to int[]
		
		for (int i:iList) {
			System.out.printf("after convert back to int %d \n", i);
		}
		
		// anagrams...
		String str1 = "iths is an test";
		String str2 ="isth si na tset";
		if (str1.length() != str2.length()) {
			System.out.printf("string %s and string %s is not anagrams", str1, str2);
			System.exit(1);
		}
		
		String[] strArr1 = str1.split(" ");
		String[] strArr2 = str2.split(" ");
		
		boolean isAnAnagrams = true;
		for (int i=0; i < strArr1.length; i++) {
			char[] charArry1 = strArr1[i].toCharArray();
			char[] charArry2 = strArr2[i].toCharArray();
			
			Arrays.sort(charArry1);
			Arrays.sort(charArry2);
			
			String s1 = new String(charArry1);
			String s2 = new String(charArry2);
			
			System.out.printf("the two strings %s and %s\n", s1, s2);
			
			if (!s1.equals(s2)) {
				isAnAnagrams = false;
				break;
			}
		}
		
		if (isAnAnagrams) {
			System.out.println("string is an anagrams");
		}else {
			System.out.println("string is not an anagrams");
		}

	}

}
