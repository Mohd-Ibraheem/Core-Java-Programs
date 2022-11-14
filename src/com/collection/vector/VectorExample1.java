package com.collection.vector;

import java.util.Vector;

public class VectorExample1 {
	
	public static void main(String[] args) {
		
		Vector<String> vec=new Vector();
		 vec.add("Lion");
		 vec.add("Tiger");
		 vec.add("Hourse");
		 vec.add("Elephent");
		 
		 System.out.println("Size is:"+vec.size());
		 System.out.println("Default capacity is:"+vec.capacity());
		 System.out.println("vector elements is:"+vec);
		 
		 if(vec.contains("Tiger")) {
			 System.out.println("The tiger is present at the index of:"+vec.indexOf("Tiger"));
			 
		 }
		 else {
			 System.out.println("Tiger is not present in the list");
		 }
		 
		 System.out.println("The first animal of vector is="+vec.firstElement());
		 System.out.println("The last animal of vector is="+vec.lastElement());
	}

}
