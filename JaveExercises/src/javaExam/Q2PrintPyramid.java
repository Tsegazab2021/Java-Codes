package javaExam;

public class Q2PrintPyramid {

	public static void printPyramidStars(int x) {
		int i;
		int j;

		for (i = 0; i < x; i++) {

			for (j = 0; j <= i; j++) {
				
				System.out.print("* ");
			}

			System.out.println();
		}
	}

	public static void main(String args[]) {
		int x = 5;
		printPyramidStars(x);
	}
}