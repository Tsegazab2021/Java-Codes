package day3;

public class Q1ForLoop {

	public static void main(String[] args) {

		int numb = 10;
		int sum = 0;
		int count =0;

		for(count = 1; count <= numb; count++)

		{
			sum = sum + count;
		}
		System.out.println("The sum of the first 10 integers is : " + sum);

	}
}
