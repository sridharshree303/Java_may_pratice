package pluralsite.arrays.collections;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListDemo {
	public static void main(String[] args) {
		linkedlist();
	}

	static void linkedlist() {

		LinkedList<String> ll = new LinkedList<String>();
		ll.add("Ravi");
		ll.add("Vijay");
		ll.add("Ajay");
		System.out.println("list : " + ll);

		// Adding an element at the specific position
		ll.add(1, "Gaurav");
		System.out.println("After invoking add(int index, E element) method: " + ll);

		LinkedList<String> ll2 = new LinkedList<String>();
		ll2.add("Sonoo");
		ll2.add("Hanumat");
		ll2.add("Vijay");

		// Adding second list elements to the first list
		ll.addAll(ll2);
		System.out.println("After invoking addAll method: " + ll);

		LinkedList<String> ll3 = new LinkedList<String>();
		ll3.add("John");
		ll3.add("Rahul");

		// Adding second list elements to the first list at specific position
		ll.addAll(1, ll3);
		System.out.println("added list by index : " + ll);

		// Adding an element at the first position
		ll.addFirst("Lokesh");
		System.out.println("After invoking addFirst method: " + ll);

		// Adding an element at the last position
		ll.addLast("Harsh");
		System.out.println("After invoking addLast method: " + ll);

		// remove an element
		ll.remove("Vijay");
		System.out.println("Remove - " + ll);

		// Removing all the new elements from arraylist
		ll.removeAll(ll2);
		System.out.println("After invoking removeAll() method: " + ll);

		// Removing first element from the list
		ll.removeFirst();
		System.out.println("After invoking removeFirst() method: " + ll);

		// Removing last element from the list
		ll.removeLast();
		System.out.println("After invoking removeLast() method: " + ll);

		// Removing all the elements available in the list
		//ll.clear();
		//System.out.println("After invoking clear() method: " + ll);
		
		//reverse an array
		Iterator<String> i = ll.descendingIterator();
		while(i.hasNext()) {
			System.out.println(i.next());
		}
	}
}
