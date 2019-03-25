import java.util.Arrays;
import java.util.Scanner;

public class SortAndSearch {
	
	//todo: Write a method bubbleSrt which gets an integer array as input and which sorts this array according to the bubble sort algorithm
	//If you don't know how bubble sort works you can read it here: http://www.pkirs.utep.edu/CIS3355/Tutorials/chapter9/tutorial9A/bubblesort.htm
	//Now write another method binSrch. This method again receives an integer array as input together with another integer n.
	//First, it sorts this array by using the bubblSrt method. Then, it searches for n.
	//You can look up the binary search algorithm here: https://www.khanacademy.org/computing/computer-science/algorithms/binary-search/a/binary-search
	public static int[] bubbleSrt(int arr[]) {
		int a =arr.length;
		for(int i=0; i<a-1;i++) 
			for(int j=0;j<a-1-i;j++) 
				if(arr[j]>arr[j+1]) { 
					int temp = arr[j];
					arr[j]= arr[j+1];
					arr[j+1]=temp;
				}
		return arr;
	} // NOTE: would be nice to add a blank line after each method
	public static int binSrch(int[] arr,int max, int min, int srch) {
		
		arr=bubbleSrt(arr);
		int center =min + ((max-min)/2);
		if(center<0) {
			return -1;
		}
		if(srch == arr[center]) {
			return center;
		}else if(srch < arr[center]) {
			
			max =center;
			return binSrch(arr, max,min,srch);
		}else {
			min = center;
			return binSrch(arr,max,min,srch);
		}
	} // NOTE: would be nice to add a blank line after each method
	public static void main(String[] args) {
		
		int [] arr = {5,8,16,3,15,4};
		System.out.println(Arrays.toString(bubbleSrt(arr)));
		System.out.println(binSrch(arr,arr.length-1, 0, 8)); // NOTE: searching for an element not in the array would result in a stack-overflow.
		                                                     //       please have a look at this again
	
		// NOTE: having huge spaces looks strage - could be removed (above and below code)
		
	}
}
