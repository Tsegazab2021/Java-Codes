package javaExam;

import java.util.Scanner;

public class Q1CalculateStdGrade {

	public static void main(String[] args) {

		// Write a program that accepts mark of a student and prints the grade

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the average of your mark: ");

		int avg = scan.nextInt();
		char grade;
		if (avg >= 90 && avg < 100) {
			grade = 'A';
			System.out.println(" Your grade is: " + grade);
		} else if (avg >= 80 && avg < 100) {
			grade = 'B';
			System.out.println("Your grade is: " + grade);
		} else if (avg >= 70 && avg < 100) {
			grade = 'C';
			System.out.println("Your grade is: " + grade);
		} else if (avg >= 50 && avg < 100) {
			grade = 'D';
			System.out.println("Your grade is: " + grade );
		} else {
			grade = 'F';
			System.out.println(" Your grade is: " + grade);
			scan.close();
		}
	}

}
