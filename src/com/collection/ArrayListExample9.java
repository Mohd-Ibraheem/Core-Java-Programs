package com.collection;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExample9 {
	
	public static void main(String[] args) {
		
		List<String> list=new ArrayList();
		
		list.add("Hen");
		list.add("Goat");
		
	//	System.out.println(list);
		
			
		
		list.add(0, "Tiger");
		
		for(String str:list)
		
		System.out.println(str);
	}

}
