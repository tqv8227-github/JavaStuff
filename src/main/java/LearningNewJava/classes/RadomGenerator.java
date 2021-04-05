package LearningNewJava.classes;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import java.util.Set;
import java.util.stream.IntStream;

public class RadomGenerator {
	public List<Integer> get10RandomNum(){
		Random random = new Random();
		List<Integer> randomNumList = new ArrayList<Integer>();
		for (int i=0; i<10; i++) {
			randomNumList.add(random.nextInt());
		}
		
		return randomNumList;
	} // end of get10RandomNum
	
	//////////////////////////////////////////////////////
	public Set<Integer> get10RandomNumWithRange(int upperBound, int lowerBound){
		Random random = new Random();
		Set<Integer> randomNumList = new HashSet<Integer>();
		IntStream is = random.ints(upperBound, lowerBound);
		Iterator<Integer> iterator = is.iterator();
		
		while (iterator.hasNext() && randomNumList.size() < 10) {
			randomNumList.add(iterator.next());
		}
		
		return randomNumList;
	} // end of get10RandomNum
	
	//////////////////////////////////////////////////////
	public Set<Integer> get5RandomPrimeNumWithRange(int upperBound, int lowerBound){
		Random random = new Random();
		Set<Integer> randomNumList = new HashSet<Integer>();
		IntStream is = random.ints(upperBound, lowerBound);
		Iterator<Integer> iterator = is.iterator();
		//Set<Integer> processedNumList = new HashSet<Integer>();
		
		while (iterator.hasNext() && randomNumList.size() < 5) {
			int currentVal = iterator.next();
			
			// if check is used to skip the numbers already got processed..
			if (randomNumList.contains(currentVal)) {
				continue;
			}
			
			boolean isPrime = true;
			
			// check to see if current number is a prime number
			for (int i=2; i < (currentVal/2); i++) {
				if ((currentVal % i) == 0) {
					isPrime = false;
					break;
				}
			}  // end for
			
			// add the number to the list if it's a prime number
			if (isPrime) {
				randomNumList.add(currentVal);
			}
			
			//processedNumList.add(currentVal);
		}  // end while
		
		return randomNumList;
	} // end of get5RandomPrimeNumWithRange
	
	/////////////////////////////////////////////////////////////////////////////
	public static void main(String[] args) {
		// get 10 random number
		RadomGenerator generator = new RadomGenerator();
		//generator.get10RandomNum().stream().map(a->"random numbers: "+a).forEach(System.out::println);
		//generator.get10RandomNumWithRange(20,60).stream().map(a->"10 unique random numbers with range: "+a).forEach(System.out::println);
		generator.get5RandomPrimeNumWithRange(1,100).stream().map(a->"5 unique prime random numbers with range: "+a).forEach(System.out::println);
		
	}
}
