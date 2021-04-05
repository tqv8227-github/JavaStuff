package LearningNewJava.classes;

public class MatrixElementSum {

	public MatrixElementSum() {
		// TODO Auto-generated constructor stub
	}
	////////////////////////////////////////////////
	public int matrixElementsSum(int[][] matrix) {
	    
	    int result = 0;
	    
	    for (int row=0; row < matrix.length; row++){
	        for (int col=0; col < matrix[row].length; col++){
	            if (row==0){
	                if (matrix[row][col] > 0){
	                    result = result+matrix[row][col];
	                }
	            }else{
	                if ((matrix[row][col] > 0) && (matrix[row-1][col] > 0)){
	                    boolean haunted=false;
	                    
	                    for (int i=0; i < row; i++){
	                        if(matrix[i][col]==0){
	                            haunted = true;
	                            break;
	                        }
	                    }  // inner for
	                    
	                    if (!haunted){
	                        result = result+matrix[row][col];
	                    }
	                    
	                }
	            }  // main else
	            
	            // System.out.printf("matrix[%d][%d]: %d\n",row,col,matrix[row][col]);
	            // System.out.println("row result: "+result);
	        }  // inner for
	    } // outer for 
	    
	    //System.out.println("result: "+result);
	    return result;

	}
	//////////////////////////////////////////////
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MatrixElementSum matrixEl = new MatrixElementSum();
		int[][] matrix = new int[][] {{0,1,1,2},{0,5,0,0},{2,0,3,3}};
		
		System.out.println("result is: "+matrixEl.matrixElementsSum(matrix));
	}

}
