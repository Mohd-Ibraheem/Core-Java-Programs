package com.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayListExample6 {
	public static void main(String[] args) {
		List<String> al=new ArrayList(); 
		
		    al.add("Aamir Bhai");
		    al.add("d");
		    al.add("c");
		    al.add("b");
		    al.add("a");
			/*
			 * System.out.println(al);
			 * 
			 * Collections.reverse(al); System.out.println(al);
			 */
		    
			/* Collections.sort(al); */
		    System.out.println(al.get(2));
             al.set(2, "Ibraheem");		
			 for(String str:al)
				 System.out.println(str);
			
	}

}
