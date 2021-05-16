package day4;

import java.util.Arrays;

public class Q4CopyArray {

	public static void main(String[] args) {
		
	
		// Initialize your your first array
	
			
		int[] myArray1 = {8, 9, 12, 14, 16}; 
		System.out.println("myArray1: " + Arrays.toString(myArray1));
	
		int[] myArray2 = Arrays.copyOf(myArray1, 5);
		System.out.println("exact copy: " + Arrays.toString(myArray2));


	 	}	 	
	}
	