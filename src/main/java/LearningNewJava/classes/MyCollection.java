package LearningNewJava.classes;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class MyCollection {
	private Set<Object> mySet = new HashSet<Object>();
	private List<Object> myList = new ArrayList<Object>();
	
	public MyCollection() {
		mySet = new HashSet<Object>();
		myList = new ArrayList<Object>();
	}
	
	public void addToSet() {
		mySet.add("This is a String");
		mySet.add(1);
		mySet.add(LocalDate.now());
		myList.add("This is a String");
	}
	
	public void addToList() {
		myList.add("This is a String");
		myList.add(1);
		myList.add(LocalDate.now());
		myList.add("This is a String");
	}
	
	public List<Object> getList(){
		return myList;
	}
	
	public Set<Object> getSet(){
		return mySet;
	}
	
	public void passedByRef(List<Integer> myList){
		myList.add(10);
		myList.add(11);
	}
	
	public void passedByValue(Integer myVal) {
		myVal = 10;
	}
	///////////////////////////////////////////////////////////////////
	int candies(int n, int m) {
	    if ((n < 1 || n > 10) || (m < 2 || m > 100) || m < n)
	    {
	         return 0;
	    }
	            
	    int result = n;
	    
	    while ((result+n) <= m){
	        result += n;
	    }
	    
	    return result;
	}
	///////////////////////////////////////////////////////////////////
	public static void main(String... args) {
		MyCollection myCollection = new MyCollection();
		myCollection.addToList();
		myCollection.addToSet();
		
		Set myLocalSet = myCollection.getSet();
		List myLocalList = myCollection.getList();
		
		String[] myStr = new String[] {"1","2"};
		Arrays.asList(myStr).stream().forEach(a->System.out.println(a));
		myLocalSet.stream().forEach(a->System.out.printf("this is set: %s\n", a));
		myLocalList.stream().distinct().map(a->"this is list: "+a).forEach(System.out::println);
		
		List<Integer> intList = new ArrayList<Integer>(Arrays.asList(1,2,3,4,5));
		myCollection.passedByRef(intList);
		intList.stream().forEach(System.out::println);
		
		Integer myVal = 5;
		myCollection.passedByValue(5);
		System.out.println("int value: "+myVal);
		
		int result = myCollection.candies(10,10);
		System.out.println("result: "+result);
	}

}
