package LearningNewJava.classes;

import java.util.stream.Stream;

public class IntegerAddition {
	public int splitAndAddInt(int myNum) {
		char[] charList = String.valueOf(myNum).toCharArray();
		int result = 0;
		
		for (int i = 0; i < charList.length; i++) {
			result += Integer.valueOf(String.valueOf(charList[i]));
		}
		
		return result;
	}
	///////////////////////////////////////////////////////////////////
	public int splitAndAddInt2(int myNum) {
		
		String[] stringArray = String.valueOf(myNum).split("");
		int result = 0;
		
		for (int i = 0; i < stringArray.length; i++) {
			result += Integer.valueOf(stringArray[i]);
		}
		
		return result;
	}
	///////////////////////////////////////////////////////////////////////
	
	public static void main(String[] args) {
		IntegerAddition add = new IntegerAddition();
		int myVal = 1245678;
		System.out.printf("the total of %d is %d \n", myVal, add.splitAndAddInt(myVal));
		System.out.printf("the total of %d is %d \n", myVal, add.splitAndAddInt2(myVal));
	}

}
