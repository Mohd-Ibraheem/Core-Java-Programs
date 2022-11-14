package com.collection;

import java.util.ArrayList;
import java.util.List;

public class SearchElementsArrayList {

	public static void main(String[] args) {
		
		List<String> list=new ArrayList();
		list.add("Apple");
		list.add("Google");
		list.add("Amazon");
		list.add("facebook");
		
		System.out.println(list.contains("Amazon"));
		System.out.println(list.indexOf("Amazon"));
		System.out.println(list.indexOf("Ibraheem"));
		
	}
}
