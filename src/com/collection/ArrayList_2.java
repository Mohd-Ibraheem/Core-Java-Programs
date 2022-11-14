package com.collection;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayList_2 {
	public static void main(String[] args) {
		ArrayList list=new ArrayList();  
		  list.add("Aamir Bhai");   
		  list.add("Ibraheem");    
		  list.add("Rehan");    
		  list.add("Najmul");    
		  
		  Iterator itr=list.iterator();
		  while(itr.hasNext()){  
		   System.out.println(itr.next());
		  }  
		 }  

}
