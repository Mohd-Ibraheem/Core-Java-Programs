package com.constructor;
//by changing the number of arguments

public class Overload {
	 
	    int i;   
	    public Overload(int k)  
	    {  
	        i=k;  
	    }  
	    public Overload(int k, int m)  
	    {  
	        System.out.println("Hi I am assigning the value max(k, m) to i");  
	        if(k>m)  
	        {  
	            i=k;   
	        }  
	        else   
	        {  
	            i=m;  
	        }  
	    }  
	  
	   public static void main (String args[])   
	    {  
	        Overload test1 = new Overload(10);  
	        Overload test2 = new Overload(12, 15);  
	        System.out.println(test1.i);  
	        System.out.println(test2.i);  
	    }  
	}  


