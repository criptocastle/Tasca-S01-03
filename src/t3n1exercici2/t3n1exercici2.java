package t3n1exercici2;

import java.util.*;

public class t3n1exercici2 {

	public static void main(String[] args) {

		final List<Integer> list1 = new LinkedList<>();
		final List<Integer> list2 = new LinkedList<>();

		list1.add(1);
		list1.add(2);
		list1.add(3);
		list1.add(4);
		list1.add(5);
		list1.add(6);
		list1.add(7);
		list1.add(8);
		list1.add(9);
		list1.add(10);

		//instance Iterator
	
		ListIterator<Integer> llistaIterator = list1.listIterator();
		while (llistaIterator.hasNext()) {
			System.out.println(llistaIterator.next());
		}
		
		while (llistaIterator.hasPrevious()) {
			list2.add(llistaIterator.previous());
		}
		
		for (Integer ll : list2) { // comprovacio que han estat afegits
			System.out.println(ll);

	 	}

	}

}