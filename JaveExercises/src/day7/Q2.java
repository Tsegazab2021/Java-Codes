package day7;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Q2 {

	public static void main(String[] args) {

		

		Set<Integer> set1 = new HashSet<>();
		Set<Integer> set2 = new HashSet<>();
		Set<Integer> unique = new HashSet<>();
		
		
		
		// First set
		
		set1.add(3);
		set1.add(4);
		set1.add(5);
		set1.add(7);
		set1.add(8);
		set1.add(9);

		// Second set

		set2.add(5);
		set2.add(2);
		set2.add(4);
		set2.add(6);
		set2.add(7);
		set2.add(11);
		
		System.out.println(set2);

		System.out.println("set1 = " + set1);
		System.out.println("set2 = " + set2);
		
		// To find the union between the sets
		unique.addAll(set2);
		System.out.println("Union = " + set1);
		
		 //To find the intersection between the sets
		set1.retainAll(set2);
		System.out.println("Intersect/found in both = " + set1);
		// To find elements that are found in set 2 but not set 1
		
		set2.removeAll(set1);
		System.out.println("Unique elements in set2: " + set2);
	}

}
