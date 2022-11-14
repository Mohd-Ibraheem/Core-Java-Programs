package com.collection;

import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class ArrayListExample7 {
	
	
	public static void main(String[] args) {
		
		//handling the program of ConcurrentModificationException 
		CopyOnWriteArrayList<String> fruit=new CopyOnWriteArrayList<String>();
		
		fruit.add("Apple");
		fruit.add("Banana");
		fruit.add("PineApple");
		fruit.add("strawberry");
		
		
		for(String str:fruit)
			fruit.add("Ibraheem");
			System.out.println(fruit);
			
	}
    

}
