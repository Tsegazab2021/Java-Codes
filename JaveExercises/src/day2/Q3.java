package day2;

import java.util.Scanner;

public class Q3 {

	public static void main(String[] args) {
		
		//Write a Java program to get a number from the user and print whether it is positive or negative
		
		Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int num = sc.nextInt();

        if (num > 0)
        {
            System.out.println("Number is positive");
        }
        else if (num < 0)
        {
            System.out.println("Negative is negative");
        }
        else
        {
            System.out.println("Number is zero");
            
            sc.close();
            
         

        }

	}
	
}
	
	
	
	
