package day4;

public class Q1ArrayInt {

	public static void main(String[] args) {

		// Write a Java program to calculate the average value of array integers.

		int [] numbers = new int [] {10, 20, 30, 40, 50};
		
		int sum = 0;
		
		for (int i = 0; i < numbers.length; i++)
			sum = sum + numbers[i];
		
		// Calculate average
		double avg = sum/numbers.length;
		System.out.println("The average is: " + avg);
		
		

}
}