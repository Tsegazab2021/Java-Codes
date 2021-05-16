package day7;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class Q3 {

	public static void main(String[] args) {

		List<Integer> List = new ArrayList<>();

		List.add(1);
		List.add(2);
		List.add(4);
		List.add(4);
		List.add(5);
		List.add(5);

		// To remove the even elements using normal for loop

		for (int i = 0; i < List.size(); i++) {
			if (i % 2 == 0) {
				
				System.out.println("Even number removed is :" + List.get(i));
				
			}
		}

			// To remove even elements using iterators.

			Iterator<Integer> itr = List.iterator();

			while (itr.hasNext()) 
			{
				if(itr.next() % 2 == 0) {
					itr.remove();
				System.out.println("Even number: " + List);

			}

			}
	}
}


