package com.collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListExample {

	public static void main(String[] args) {
		List l = new ArrayList();
		l.add("ibraeem");
		l.add("kaif");
		l.add("najmul");

		
		  
		  Iterator itr= l.iterator(); while(itr.hasNext()) {
	      System.out.println(itr.next()); }
		 

		/*
		 * for(String name:l) System.out.println(name);
		 */

	}

}
