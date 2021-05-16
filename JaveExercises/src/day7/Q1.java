package day7;

import java.util.Set;
import java.util.TreeSet;

public class Q1 {

	public static void main(String[] args) {
		Set<String> letters = new TreeSet<String>();
		
		// Find the sorted unique values
		
		letters.add("A");
		letters.add("F");
		letters.add("A");
		letters.add("D");
		letters.add("F");
		letters.add("C");
		letters.add("B");
		
		System.out.println(letters);
}
}