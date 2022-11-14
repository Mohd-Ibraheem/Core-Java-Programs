package com.collection.linkedlist;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class LinkedListExample3 {
	
	public static void main(String[] args) {
		List<String> li=new LinkedList();
		/*
		 * li.add("Uzair"); li.add("Niasir"); li.add("rehan");
		 */
		   Collections.addAll(li,"Ibraheem", "Kaif","Rehan");
		   Iterator itr =  li.iterator();
		     while(itr.hasNext()) {
		    	 System.out.println();
		     }
		   
	}

}
