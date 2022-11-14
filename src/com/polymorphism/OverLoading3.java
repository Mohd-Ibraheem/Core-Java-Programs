package com.polymorphism;

public class OverLoading3 {
	
	void sum(int a,long b){
		System.out.println("a method invoked");
		}  
	  void sum(long a,int b){
		  System.out.println("b method invoked");
		  }  
	  
	  public static void main(String args[]){  
	  OverLoading3 obj=new OverLoading3();  
	  //obj.sum(20,20);//now ambiguity  
	  }  
	}  

