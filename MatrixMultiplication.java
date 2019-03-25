//2D Arrays
public class MatrixMultiplication {
	
	//Todo: Each 2D Array can be treated like a matrix.
	//Write a method which takes two matrices as input and returns the result.
	//Write a main-method where you call your created method for matrix multiplication
	//and print the result properly
	public static int[][] matrixMul(int[][]a,int[][]b){
		 int[][]result= new int[a.length][b[0].length];
		  for(int i=0; i<a.length;i++) {
			  for(int j=0; j<b[0].length; j++) {
				  for(int k=0; k<b.length;k++) {
					result[i][j]  += a[i][k]*b[k][j];
					  
				  }
			  
			  }
		  }
		  return result;
	 
	} // NOTE: indentation is a little bit off from here
	 public static void main(String[] args) {
		 int[][] a = {{3,2},{1,2}}; 
		  int[][] b = {{2,4},{6,5}};
		  int[][] res= matrixMul(a,b);
		  for(int i=0; i<res.length;i++) {
				 for(int j=0; j<res[0].length; j++) {
					 System.out.print(res[i][j] + " ");
					 
				 }
				 System.out.println();
		  }
	 }
}
