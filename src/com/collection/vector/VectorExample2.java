package com.collection.vector;

import java.util.Collections;
import java.util.Vector;

public class VectorExample2 {
	
	public static void main(String[] args) {
		
		Vector<Integer> in=new Vector();
		in.add(10);
		in.add(20);
		in.add(30);
		in.add(50);
		in.add(40);
		
		Collections.sort(in);
		System.out.println(in.capacity());
		
		System.out.println(in);
		
	}

}
