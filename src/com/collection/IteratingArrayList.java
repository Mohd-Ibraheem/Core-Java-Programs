package com.collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IteratingArrayList {
	
	public static void main(String[] args) {
		List<String> tvShows = new ArrayList<>();
        tvShows.add("Breaking Bad");
        tvShows.add("Game Of Thrones");
        tvShows.add("Friends");
        tvShows.add("Prison break");
        
        System.out.println("!--replacing elements--!");
        for(String str:tvShows) {
        	String s1=str.replace("Friends", "Friend");
        	
        	System.out.println(s1);
        }
        	
        
		
		 System.out.println("=== Iterate using Java 8 forEach and lambda ===");
		  tvShows.forEach(tvshows->{ System.out.println(tvshows); });
		 
        System.out.println("== Iterator by for each loop==");
        Iterator itr=tvShows.iterator();
        while(itr.hasNext()) {
        	System.out.println(itr.next());
        }
	}

}
