package day3;

import java.util.Scanner;

public class Q5CalcAvg {

	public static void main(String[] args) {

		double total = 0;
		double count = 0;

		Scanner sc = new Scanner(System.in);

		System.out.print("Enter the value of x: ");

		while (sc.hasNextInt()) {
			System.out.print("Enter the value of y: ");
			double input = sc.nextDouble();
			total = total + input;

			count++;
		}
		System.out.println(total);
		double avg = 0;
		if (count > 0) {
			avg = total / count;
		}

		System.out.println(" The average is: " + avg);

		sc.close();

	}
}
