package com.collection;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListExample4 {
	
	public static void main(String[] args) {
		ArrayList<String> list=new ArrayList<String>();
		list.add("Aamir Bhai");
		list.add("Ibraheem");
		list.add("Rehan");
		list.add("Najmul");
		
		Collections.sort(list);
		
		for(String str:list)
			System.out.println(str);
		System.out.println("Sorting Number---------------------!");
		
		
		ArrayList<Integer> list1=new ArrayList<Integer>();
		 list1.add(12);
		 list1.add(13);
		 list1.add(9);
		 list1.add(2);
		 
		 Collections.sort(list1);
		 
		 for(Integer k:list1)
			 System.out.println(k);
		
	}

}
