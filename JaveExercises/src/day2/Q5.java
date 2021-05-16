package day2;

import java.util.Scanner;

public class Q5 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Enter Age: ");
		int age = sc.nextInt();
		System.out.println("Your age is: " + age);

		if (age <18) {
			System.out.println("You are not eligble to vote");
		}
		 else if (age >= 18  && age <= 80) {
			System.out.println("You are eligible to vote");

		}

		else {
			System.out.println("You are too old to vote");

			sc.close();
		}

	}
}
