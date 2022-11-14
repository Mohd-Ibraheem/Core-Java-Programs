package com.collection.linkedlist;

import java.util.LinkedList;
import java.util.List;

public class LinkedListExample2 {
	public static void main(String[] args) {

	List<String> li=new LinkedList();
	li.add("Ibraheem");
	li.add("Uzair");
	
//	System.out.println(li);
	
	List<String> li1=new LinkedList();
	li1.add("Aamir bhai");
	li1.add("Bushra Appi");
	
	li.addAll(li1);
	((LinkedList) li).addFirst("k");
	((LinkedList) li).addLast("y");
	
	//li.clear();
	((LinkedList) li).removeFirst();
	((LinkedList) li).removeLast();
	
	System.out.println(li);
	
	
	
	
	}
}
