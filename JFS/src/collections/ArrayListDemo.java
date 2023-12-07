package collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class ArrayListDemo {

	public static void main(String[] args) {
		List list1 = new ArrayList();
		System.out.println("Size: " + list1.size());
		System.out.println("Is list empty? " + list1.isEmpty());
		list1.add(10);
		list1.add(20);
		list1.add(true);
		list1.add(false);
		list1.add(20);
		list1.add("Hello");
		list1.add(56.78);
		list1.add(20);
		list1.add('A');
		list1.add(5, "Hi");
		list1.add(20);
		System.out.println("List is " + list1);
		System.out.println("is list contains 15? " + list1.contains(15));
		list1.remove(false);
		System.out.println("List is " + list1);
		System.out.println("5th element of list: " + list1.get(5));
		System.out.println("Element removed: " + list1.remove(list1.lastIndexOf(20)));
		System.out.println("Element removed: " + list1.remove(list1.indexOf(20)));
		System.out.println("List is " + list1);

//		Homogeneous List
		List<String> names = new ArrayList<String>();
		names.add("Amit");
		names.add("Vikram Patel");
		names.add("Anirudh");
//		names.add(43); // The method add(int, String) in the type List<String> is not applicable for the arguments (int)
		names.add("Chandan");
		names.add("Shashi");
		names.add("Cisco");

		System.out.println("Name list: " + names);
		System.out.println("Is \'Ankith\' is in the list: " + names.contains("Ankith"));
		Collections.sort(names);
		System.out.println("Soritng in Ascending order: " + names);

		Collections.reverse(names);
		System.out.println("Sorting in Descending order: " + names);

		Iterator<String> i = names.iterator();
		System.out.println("***********Traversing the list***********");
		while (i.hasNext()) {
			String nm = i.next();
			System.out.println(nm);
			if (nm.equals("shashi")) {
				i.remove();
			}
//			System.out.println(nm);
		}

		System.out.println("***********Traversing the list backward***********");
		ListIterator<String> li = names.listIterator(names.size());
		while (li.hasPrevious()) {
			String nm = li.previous();
			System.out.println(nm);
		}
	}

}
