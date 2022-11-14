package com.collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListRemoveExample2 {
	
	public static void main(String[] args) {
		
		List<Integer> list=new ArrayList();
		list.add(18);
		list.add(13);
		list.add(32);
		list.add(9);
		list.add(3);
		
		Iterator<Integer> itr = list.iterator();
		while(itr.hasNext()) {
			Integer next = itr.next();
			
			
			if(next % 2!=0) {
				itr.remove();
			}
		}
		System.out.println(list);
	}

}
