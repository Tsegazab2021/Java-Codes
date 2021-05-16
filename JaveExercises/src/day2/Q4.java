package day2;

import java.util.Scanner;

public class Q4 {

	public static void main(String[] args) {
		
Scanner sc = new Scanner(System.in);
		
		//System.out.print("Enter  number: ");
		System.out.println("Enter first number: ");
		int firstnum = sc.nextInt();
	
		System.out.println("Enter second number: ");
		int secondnum = sc.nextInt();
		
		System.out.println(firstnum + secondnum);
		System.out.println(firstnum - secondnum);
		

		sc.close();
	}

}
