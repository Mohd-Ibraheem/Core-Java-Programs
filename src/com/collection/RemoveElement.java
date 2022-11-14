package com.collection;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class RemoveElement {
	public static void main(String[] args) {
		
	List<String> programmingLanguages = new ArrayList<>();
    programmingLanguages.add("C");
    programmingLanguages.add("C++");
    programmingLanguages.add("Java");
    programmingLanguages.add("Kotlin");
    programmingLanguages.add("Python");
    programmingLanguages.add("Perl");
    programmingLanguages.add("Ruby");
    
    System.out.println("Initial List: " + programmingLanguages);
    
 // Remove the element at index `3`
    programmingLanguages.remove(3);
    System.out.println("After remove(3):"+programmingLanguages);
    
    // Remove the first occurrence of the given element from the ArrayList
    // (The remove() method returns false if the element does not exist in the ArrayList)
    boolean b=programmingLanguages.remove("Java");
    System.out.println(programmingLanguages);
    
 // Remove all the elements that exist in a given collection
    List<String> list=new ArrayList<>();
    list.add("Apple");
    list.add("Mango");
    list.add("Banana");
    
    programmingLanguages.removeAll(list);
    System.out.println(programmingLanguages);
    

    /*
        The above removeIf() call can also be written using lambda expression like this -
        programmingLanguages.removeIf(s -> s.startsWith("C"))
    */
    
 // Remove all the elements that satisfy the given predicate
    programmingLanguages.removeIf((Predicate<? super String>) new Predicate<String>() {
        @Override
        public boolean test(String s) {
            return s.startsWith("C");
        }
    });
    System.out.println(programmingLanguages);
    
 // Remove all elements from the ArrayList
    programmingLanguages.clear();
    System.out.println(programmingLanguages);
    
	}
}
