package day6;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetExample {

	public static void main(String[] args) {

		Set <Integer> myInt =   new HashSet<Integer>(); 
		myInt.add(1);
		myInt.add(3);
		myInt.add(4);
		myInt.add(5);
		myInt.add(7);
		myInt.add(9);
		myInt.add(12);
		myInt.add(14);
		myInt.add(15);
		
		Iterator<Integer> iter = myInt.iterator();
		
		while (iter.hasNext())
		{
			if(iter.next() % 3 == 0) 
			iter.remove();
		System.out.println(myInt);
		
		
	}

	
	}
}