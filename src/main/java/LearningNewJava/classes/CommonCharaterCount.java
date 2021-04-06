package LearningNewJava.classes;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class CommonCharaterCount {

	public CommonCharaterCount() {
		// TODO Auto-generated constructor stub
	}
	/////////////////////////////////////////////////////////
	public int countCommonChar(String str1, String str2) {
		String[] strArray1 = str1.split("");
		String[] strArray2 = str2.split("");
		Map<String, Integer> mapStr1 = countCharInString(strArray1);
		Map<String, Integer> mapStr2 = countCharInString(strArray2);
		
		int totalCounts = 0;
		for (Map.Entry<String, Integer> currObj:mapStr1.entrySet()) {
			String currKey = currObj.getKey();
			
			if (mapStr2.containsKey(currKey)) {
				Integer currVal = currObj.getValue();
				Integer currVal2 = mapStr2.get(currKey);
				totalCounts += currVal > currVal2?currVal2:currVal;
			}
			
		}
		
		return totalCounts;
	}
	///////////////////////////////////////////////////////////
	public Map<String, Integer> countCharInString(String[] str){
		Map<String, Integer> myMap = new HashMap<String, Integer>();
		Set<String> mySet = new HashSet<String>();
		
		for (int i=0; i < str.length; i++) {
			int counts = 1;
			boolean found = false;
			
			for (int j=i+1; j < str.length; j++) {
				if (mySet.contains(str[i])) {
					found = true;
					break;
				}
				
				if (str[i].equals(str[j])) {
					++counts;
				}
			}  // inner for 
			
			if (!found && !mySet.contains(str[i])) {
				myMap.put(str[i], counts);
				mySet.add(str[i]);
			}
		}
		
		return myMap;
	}
	///////////////////////////////////////////////////////////
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CommonCharaterCount charCount = new CommonCharaterCount();
		
		String str1="abcaccxyz";
		String str2="xyzbacc";
		
		System.out.println("total counts: "+charCount.countCommonChar(str1, str2));

	}

}
