package LearningNewJava.classes;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class Anagrams {
	
	public void checkAnagrams(String str1, String str2) {	
		// make sure that the strings have the same length before proceed...
		if (str1.length() != str2.length()) {
			System.out.printf("Not equal length. string %s and string %s is not anagrams", str1, str2);
			System.exit(1);
		}
		
		// Split the two strings in different arrays of strings
		String[] strArr1 = str1.split(" ");
		String[] strArr2 = str2.split(" ");
		
		/* going through each element of the two arrays and convert them into arrays of Char;
		 * Sort the two Char arrays and compare them. */
		boolean isAnAnagrams = true;
		
		for (int i=0; i < strArr1.length; i++) {
			// convert string[i] to Char string on both
			char[] charArry1 = strArr1[i].toCharArray();
			char[] charArry2 = strArr2[i].toCharArray();
			
			// sort the Char arrays and convert them back to strings
			Arrays.sort(charArry1);
			Arrays.sort(charArry2);
			
			String s1 = String.copyValueOf(charArry1);//new String(charArry1);
			String s2 = String.copyValueOf(charArry2);//new String(charArry2);
			
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

	}  // end of checkAnagrams method
	////////////////////////////////////////////////////////////////////////////
	public boolean checkAnagramsII(String str1, String str2) {
		
		if (str1.length() != str2.length()) {
			return false;
		}
		
		// turn strings into arrays of strings
		String[] strArray1 = str1.split(" ");
		String[] strArray2 = str2.split(" ");
		//ArrayList list = new ArrayList(Arrays.asList(strArray1));
		//Comparator<String> comparator = (a,b)-> {return a.compareTo(b);};
		//list.sort(comparator);
		
		// sort the strings within the arrays and compare. can use Arrays.sort() but opt to build sort function		
		boolean isAnnagrams = true;
		
		for (int i = 0; i < strArray1.length; i++) {
			if (!sort(strArray1[i]).equals(sort(strArray2[i]))) {
				isAnnagrams=false;
				break;
			}
		}// for
		
		return isAnnagrams;
	}
	///////////////////////////////////////////////////////////
	public String sort(String inputStr) {
		if (inputStr == null || inputStr.length() <= 1) {
			return inputStr;
		}
		
		char[] charList = inputStr.toCharArray();
		for (int i=0; i < charList.length-1; i++) {
			for (int j=i+1; j < charList.length; j++) {
				if (charList[i] > charList[j]) {
					char temp = charList[i];
					charList[i] = charList[j];
					charList[j] = temp;
					
				}
			}  // inner for
		}  // outer for
		
		String result = String.copyValueOf(charList);
		return result;
	}
	//////////////////////////////////////////////////////////////////////////////////
	public static void main(String[] args) {
		String str1 = "iths is a test";
		String str2 = "isth si a tset";
		
		Anagrams anagrams = new Anagrams();
		anagrams.checkAnagrams(str1, str2);
		boolean result = anagrams.checkAnagramsII(str1, str2);
		System.out.println("Is an Anagram? "+result);
	}
}
