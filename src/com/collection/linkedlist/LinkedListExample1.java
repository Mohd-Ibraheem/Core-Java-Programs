package com.collection.linkedlist;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class LinkedListExample1 {
	public static void main(String[] args) {

		List<String> li = new LinkedList();
		li.add("Zaid");
		li.add("Ibraheem");
		li.add("Kaif");
		li.add("Uzair");
		li.add("Ibraheem");

		// Collections.sort(li);

		// li.remove(1);
		// Collections.reverse(li);

		for (int i = 0; i < li.size(); i++)
			;

		System.out.println(li);

		// Traversing elements by forEach loop
		/*
		 * for(String str:li) System.out.println(str);
		 */

		// Traversing elements by iterator
		/*
		 * Iterator itr = li.iterator(); while(itr.hasNext()) {
		 * System.out.println(itr.next()); }
		 */

	}
}
