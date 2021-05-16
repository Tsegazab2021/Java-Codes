package javaExam;

import java.util.Scanner;

public class Q3VowelsCount {

	public static void main(String[] args) {
		// Write a program that takes a string and displays the vowels count in the input string

		
		Scanner input = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = input.nextLine();
        
        input.close();
        System.out.print("Number of  Vowels in the string: " + countVowels(str)+"\n");
    }
 public static int countVowels(String str)
    {
        int count = 0;
        for (int i = 0; i < str.length(); i++)
        {
            if (str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i'
                    || str.charAt(i) == 'o' || str.charAt(i) == 'u')
            {
                count++;
            }
        }
        return count;
        
	}

}
