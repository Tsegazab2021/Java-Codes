package day3;

import java.util.Scanner;

public class Q3Switch {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int day = sc.nextInt();
		System.out.println(getDayName(day));

		sc.close();

	}

	public static String getDayName(int day) {
		String dayName = " ";
		String dateType = " ";
		if (0 < day && day < 6) {
			dateType = "Weekday";
		} else if (day > 5 && day < 8) {
			dateType = "Weekend";
		} else {
			dateType = "Invalid";
		}

		switch (dateType) {
		case "Weekday": {
			switch (day) {
			case 1:
				dayName = "Monday";
				break;
			case 2:
				dayName = "Tuesday";
				break;
			case 3:
				dayName = "Wednesday";
				break;
			case 4:
				dayName = "Thursday";
				break;
			case 5:
				dayName = "Friday";
				break;

			}
		}
			break;

		case "Weekend": {
			switch (day) {
			case 6:
				dayName = "Saturday";
				break;
			case 7:
				dayName = "Sunday";
				break;
			}
		}
			break;

		default:
			dateType = "Invalid Entry";

		}
		return dateType + "," + dayName;

	}

}
