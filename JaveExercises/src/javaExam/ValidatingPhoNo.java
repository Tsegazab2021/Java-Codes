package javaExam;

import java.util.Scanner;

public class ValidatingPhoNo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a phone numbr: ");
		String num = sc.nextLine();
		sc.close();
		
		 if(num.matches("[0-9]{3}[-]{1}[0-9]{3}[-]{1}[0-9]{4}")) {
		   System.out.println("Phone number is valid: ");

	}
	else
	{
		System.out.println("Phone number is invalid: ");
	}


}
}
