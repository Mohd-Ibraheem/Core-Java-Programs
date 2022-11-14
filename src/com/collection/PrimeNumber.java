package com.collection;

import java.util.ArrayList;
import java.util.List;

public class PrimeNumber {
	
	public static void main(String[] args) {
		
		List<Integer> i=new ArrayList();
		i.add(2);
		i.add(3);
		i.add(5);
		i.add(7);
		i.add(11);
		
		 // Creating an ArrayList from another collection
		List<Integer> i2=new ArrayList(i);
		
		List<Integer> i1=new ArrayList();
		i1.add(13);
		i1.add(17);
		i1.add(19);
		i1.add(23);
		i1.add(29);
		
		 // Adding an entire collection to an ArrayList
		i2.addAll(i1);
		
		System.out.println(i2);
		
	}

}
