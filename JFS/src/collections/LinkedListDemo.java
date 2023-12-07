package collections;

import java.util.Collections;
import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedListDemo {

	public static void main(String[] args) {
		LinkedList<Integer> li = new LinkedList<Integer>();
		li.add(10);
		li.add(20);
		li.add(40);
		li.addFirst(5);
		li.add(2, 50);
		li.addLast(25);
		li.add(30);

		System.out.println("Number list: ");

		System.out.println(li.getFirst());
		System.out.println(li.removeLast());
		ListIterator<Integer> l = li.listIterator();

		while (l.hasNext()) {
			System.out.println(l.next() + "\t");
		}

		l = li.listIterator(li.size());

		while (l.hasPrevious()) {
			int n = l.previous();
			if (n == 0) {
				l.add(999999);
			}
			if (n == 50) {
				l.set(5555);
			}
		}
		System.out.println("The list: " + li);
		Collections.sort(li);
		System.out.println("The list after sorting in Ascending Order: " + li);
		Collections.reverse(li);
		System.out.println("The list after sorting in Descending Order: " + li);

	}

}
