package day7;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Students implements Comparable<Students> {

	private String firstName;
	private int age;

	public Students(String firstName, int age) {
		this.firstName = firstName;
		this.age = age;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Student [firstName=" + firstName + ", age=" + age + "]";
	}

	@Override
	public int compareTo(Students s) {

		return firstName.length();
	}

	// File: MainStudent.java
	public static void main(String[] args) {

		List<Students> students = new ArrayList<>();
		students.add(new Students("Hagos", 20));
		students.add(new Students("Zeray", 18));
		students.add(new Students("Tirhas", 25));
		students.add(new Students("Seble", 23));

		Collections.sort(students);
		System.out.print(students);
	}

}
