package LearningNewJava.classes;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class TheaterSeatCounts {

	public TheaterSeatCounts() {
		// TODO Auto-generated constructor stub
	}
	///////////////////////////////////////////////////////////////////////////////
	public int countSeats(int nCols, int nRows, int col, int row) {
	    
	    if (nCols < 1 || nCols > 1000 || nRows < 1 || nRows > 1000 || col < 1 || col > nCols || 
	        row < 1 || row > nRows){
	            return 0;
	    }
	    
	    //int[][] theaterSeats = new int[nRows][nCols];
	    
	    int seatCounts = 0;
	    for (int i=row; i < nRows ; i++){
	        for (int j = col-1; j < nCols; j++){
	            seatCounts += 1;
	        }
	    }   // end outer for
	    
	    return seatCounts;
	}
	////////////////////////////////////////////////////////////////////////////////////
	boolean almostIncreasingSequence(int[] sequence) {
        if (sequence == null || sequence.length < 2 || sequence.length > Math.pow(10, 5)){
	        return false;
	    }
	    
	    boolean result = true;
	    int counts = 0;
	    List<Integer> newSeq = Arrays.stream(sequence).boxed().collect(Collectors.toList());
	    
        //int elementCounts = newSeq.size();
        
	    for (int i = 0; i < newSeq.size()-1; i++){
	        for (int j=i+1; j < newSeq.size(); j++){
                int currEl = newSeq.get(i);
                int nextEl = newSeq.get(j);
                
	            if (currEl >= nextEl){
	                counts += 1;
                    if (currEl > nextEl)
	                    newSeq.remove(i);
                    else
                        newSeq.remove(j);
	                j--;
	            }
	        }
	        
	        if (counts > 1) {
	        	break;
	        }
	    }  // outer for
	    
	    System.out.println("count is : "+counts);
	    return (counts > 1? false:result);
	}
	///////////////////////////////////////////////////////////////////////////////////
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TheaterSeatCounts seatCounts = new TheaterSeatCounts();
		System.out.println("number of seats: "+seatCounts.countSeats(16, 11, 5, 3));
		
		int[] testList = new int[] {1, 3, 2, 1};
		System.out.println("result: "+seatCounts.almostIncreasingSequence(testList));
		
		//System.out.println("-10^2 is: "+Math.pow(-10, 3));
	}

}
