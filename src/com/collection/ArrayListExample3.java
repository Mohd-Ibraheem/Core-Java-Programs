package com.collection;

import java.util.ArrayList;

public class ArrayListExample3 {
	public static void main(String[] args) {
		
		ArrayList<String> al=new ArrayList<String>();
		
		al.add("up");
		al.add("Kerla");
		al.add("Hydrabad");
		al.add("Bhopla");
		
		System.out.println("Returning the elements:"+al.get(2));
		al.set(2, "Maharashtra");
		
		al.add(1, "Dubai");
		
		for(String city:al)
		System.out.println(city);
		
	}

}
