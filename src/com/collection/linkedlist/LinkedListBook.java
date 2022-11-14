package com.collection.linkedlist;

import java.util.LinkedList;
import java.util.List;

class Book {
	int id;
	String name;
	String address;

	Book(int id, String name, String address) {
		this.id = id;
		this.name = name;
		this.address = address;
	}

}

public class LinkedListBook {
	public static void main(String[] args) {

		List<Book> li = new LinkedList<Book>();
		Book b1 = new Book(1, "Ibraheem", "Mumbra");
		Book b2 = new Book(2, "kaif", "agya");
		Book b3 = new Book(3, "uzair", "Govandi");

		li.add(b1);
		li.add(b2);
		li.add(b3);

		//Traversing elements
		for (Book b : li)
			System.out.println(b.id + " " + b.name + " " + b.address);
	}
}
