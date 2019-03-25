import java.util.ArrayList;

//Bonus 2D Arrays
public class MagicSquare {
	/*
	 * Todo: A magic square is a quadratic matrix where the sums of each row and
	 * each column are equal. All possible numbers from 1 to (side length)^2 have to occur
	 * in the square. Write a method that takes a 2D Array as input and checks if it is a magic
	 * square or not.
	 * */
	public static boolean isMagicSquare(int[][]a) {
//		checking it is a square
		for(int i=0; i<a.length; i++) {
			if(a.length != a[i].length) {
				return false;
			}
		} // NOTE: indentation is a little bit off here
			System.out.println("it is a square");
//			checking possible  num from 1 to side length^2 in the list 
			ArrayList<Integer> arrlist = new ArrayList<>();	// NOTE: nice solution, could also be solved without ArrayList's - using an array of size 
			for(int i=0; i<Math.pow(a.length, 2); i++) {
				if(isInList(arrlist,i)) { // NOTE: you don't need to check it on your own, use arrlist.contains(...)
					return false;
				}
				else {
					arrlist.add(new Integer(i));
				}
			}
			System.out.println("All possible numbers occur exactly one time");
//			checking of diagonal, rows and columns sum
			int sum =0;
			int temp =0;
			for(int i=0; i<a.length; i++) {
				sum += a[i][i];
			}
			
			for(int x=0 ;x< a.length; x++) {
				for(int y=0; y<a[x].length; y++) {
					temp +=a[x][y];
				}if(temp != sum) {
					return false;
				}temp =0;
			}
		
			for(int x=0 ;x< a.length; x++) {
				for(int y=0; y<a[x].length; y++) {
					temp += a[y][x];
				}if(temp != sum) {
					return false;
				}
				temp =0;
			}	
			System.out.println("Diagonal and rows and columns sum are equal");

			return true;

	}
	public static boolean isInList(ArrayList<Integer> a, int x) {
		for(int i : a) {
			if(i==x) {
				return true;
			}
		}
		return false;
	}
	public static void main(String[] args) {
		int [][] a = {{8,1,6},{3,5,7},{4,9,2}};
		boolean output = isMagicSquare(a);
		System.out.println(output);
		if(output) {
			for(int i=0; i<a.length;i++) {
				 for(int j=0; j<a[0].length; j++) {
					 System.out.print(a[i][j] + " ");
					 
				 }
				 System.out.println();
			 }
		}
	}
	
}
