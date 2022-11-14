package com.collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class ArrayListExample8 {

	public static void main(String[] args) {
		
	List<String> list=new ArrayList();
	list.add("Ibraheem");
	list.add("Kaif");
	list.add("Rehan");
	list.add("Obaid");
	
	//Making the class Read Only
	Collection<String> unmodifiableCollection = Collections.unmodifiableCollection(list);
	unmodifiableCollection.add("Nasir");
	unmodifiableCollection.remove(list);
	System.out.println(list);
}
}