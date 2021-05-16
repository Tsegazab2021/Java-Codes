package javaExam;

import java.util.Scanner;

public class ValidatingPhoNo {

	public static void main(String[] args) {
		String phone = "784-987-3467";
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a phone numbr: ");
		String num = sc.nextLine();
		sc.close();
		
		 if(num.length()>=9 || phone.length()<=11) {
		   System.out.println("Phone number is valid: ");

	}
	else
	{
		System.out.println("Phone number is invalid: ");
	}

}
}
