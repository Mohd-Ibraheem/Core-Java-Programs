package com.collection;

import java.util.ArrayList;
import java.util.List;

public class AccessElementArraList {
	
	public static void main(String[] args) {
		
		List<String> list=new ArrayList();
		//list.add("Apple");
		// Check if an ArrayList is empty
		System.out.println(list.isEmpty());
		
		list.add("Google");
		list.add("Apple");
		list.add("Amazon");
		
		// Find the size of an ArrayList
		System.out.println(list.size());
		
		// Retrieve the element at a given index
		String str=list.get(0);
		System.out.println(str);
		String str1=list.get(list.size()-1);
		System.out.println(str1);
		
		 // Modify the element at a given index
		list.set(2, "Instagram");
		System.out.println(list);
		
		
	}

}
