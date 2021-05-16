package day4;

public class Q3ArrayIndex {

	public static void main(String[] args) {
		
		// Write a Java program to find the index of an array element
		
		int[] scores = { 60, 70, 80, 90, 100 };
		for (int i = 0; i < scores.length; i++) {
			if (scores[i] == 90) {
				System.out.println("found at index: " + i);
			}

		}
	}
}



