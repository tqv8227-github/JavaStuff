package LearningNewJava.classes;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LongestString {

	public LongestString() {
		// TODO Auto-generated constructor stub
	}
	/////////////////////////////////////////////////
	String[] allLongestStrings(String[] inputArray) {
	    if (inputArray.length > 10 || inputArray.length < 1){
	        return inputArray;
	    }
	    
	    List<String> stringList = new ArrayList<String>();
	    int maxLen = 0;
	    
	    for (int i=0; i < inputArray.length; i++){
	    	if (inputArray[i].length() > maxLen)
	    		maxLen = inputArray[i].length();
	    }  // outer for
	    
	    for (int j=0; j < inputArray.length; j++) {
	    	if (inputArray[j].length()==maxLen) {
	    		stringList.add(inputArray[j]);
	    	}
	    }
	    
	    return stringList.toArray(new String[0]);

	}
	///////////////////////////////////////////////////////////////////////////////
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LongestString longestStr = new LongestString();
		String[] testArray = new String[] {"aba", 
				 "aa", 
				 "ad", 
				 "vcd", 
				 "aba"};
		
		String[] result = longestStr.allLongestStrings(testArray);
		Arrays.asList(result).forEach(System.out::println);

	}

}
