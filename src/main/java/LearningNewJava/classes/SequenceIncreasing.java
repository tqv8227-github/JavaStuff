package LearningNewJava.classes;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class SequenceIncreasing {

	public SequenceIncreasing() {
		// TODO Auto-generated constructor stub
	}
	////////////////////////////////////////////////////////////////////////////////////
	/* this solution works but has an issue with performance */
	boolean almostIncreasingSequence(int[] sequence) {
	    if (sequence == null || sequence.length < 2 || sequence.length > Math.pow(10, 5)){
	        return false;
	    }
	    
	    boolean result = true;
	    int counts = 0;
	    List<Integer> newSeq = Arrays.stream(sequence).boxed().collect(Collectors.toList());
        
        if (newSeq.stream().filter(a-> ((a > Math.pow(10, 5)) || (a < Math.pow(-10,5)))).count() > 0)
            return false;
        int i = 0;
        
	    while (i < newSeq.size()-1){
	    	boolean found = false;
	    	
	        for (int j=i+1; j < newSeq.size(); j++){
                Integer currEl = newSeq.get(i);
                Integer nextEl = newSeq.get(j);
                    
	            if (currEl >= nextEl){
	                counts += 1;
	                
                    if (currEl > nextEl)
	                    newSeq.remove(i);
                    else
                        newSeq.remove(j);
	                //i--;
                    found = true;
                    break;
	            }
	            
                if (counts > 1) {
		        	break;
		        }
	        }
	        
	        if (!found) {
	        	++i;
	        }
	        
	        if (counts > 1) {
	        	break;
	        }
	    }  // outer for
	    
	    System.out.println("count is : "+counts);
	    return (counts > 1? false:result);
	}
	///////////////////////////////////////////////////////////////////////////////////////////////
	/* This Solution works..... */
	boolean almostIncreasingSequenceII(int[] sequence) {
	    if (sequence.length == 2) 
	    	return true;
	    
	    int countOne = 0;
	    int countTwo = 0;
	    
	    for (int i = 0; i < sequence.length - 1; i++) {
	       if (sequence[i] >= sequence[i+1]) {
	           countOne++;
	       }
	       
	       if(i != 0) {
	           if (sequence[i - 1] >= sequence[i + 1]) {
	               countTwo++;
	           }
	       }
	    }  // end for
	    
	    if (countOne == 1 && countTwo <= 1) {
	        return true;
	    } else {
	        return false;
	    }
	}
	/////////////////////////////////////////////////////////////////////////////////////////////////

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SequenceIncreasing sequence = new SequenceIncreasing();
		int[] seqList = new int[] {1, 1, 1};
		
		System.out.println("Is a sequence increasing? "+sequence.almostIncreasingSequence(seqList));
		System.out.println("Is a sequence increasing II? "+sequence.almostIncreasingSequenceII(seqList));
	}

}
