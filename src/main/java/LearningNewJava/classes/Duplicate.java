package LearningNewJava.classes;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Duplicate {
	public Set<Integer> findDuplidate(Integer[] numList){
		
		Set<Integer> result = new HashSet();
		
		if (numList == null || numList.length==1) {
			return result;
		}
		
		for (int i=0; i < numList.length-1; i++) {
			for (int j=i+1; j < numList.length; j++) {
				if (numList[i]== numList[j]) {
					result.add(numList[i]);
					break;
				}
			}  // inner
		} // outer for 
		
		return result;
	}
	///////////////////////////////////////////////////////////
	public static void main(String[] args) {
		Duplicate duplicate = new Duplicate();
		
		Integer[] intArray = new Integer[]{2,3,2,4,1,2,3};
		Set<Integer> myResult = duplicate.findDuplidate(intArray);
		
		if (myResult.size() == 0) {
			System.out.println("no duplidate found.");
		}
		
		myResult.stream().forEach(System.out::println);
	}
}
