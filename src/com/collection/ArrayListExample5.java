package com.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.ListIterator;

public class ArrayListExample5 {
	public static void main(String[] args) {
		
		ArrayList<String> list=new ArrayList();
		 list.add("Ibraheem");
		 list.add("Kaif");
		 list.add("Uzair");
		 list.add("Rehan");
		 
		 Collections.sort(list);
		 
		// Travrsing elements by using ListIterator
		 
		/* 
		 ListIterator<String> li=list.listIterator(list.size());
		 while(li.hasPrevious()) {
			 String str=li.previous();
			 System.out.println(str);*/
		 
		 //Traversing elements by using forEach Loop
		 
			/*
			 * for(String str:list) System.out.println(str);
			 */
		 
		 /*Traversing elements usning for loop
		 for(int i=0;i<list.size();i++) {
			 System.out.println(list.get(i));*/
			 
		 
		            //forEach loop
		 
					/*
					 * list.forEach(b->{//using lamda expression System.out.println(b); });
					 */
		    Iterator<String> itr = list.iterator();
		    itr.forEachRemaining(a->{
		    	System.out.println(a);
		    });
		 }
		 }
		 
	


