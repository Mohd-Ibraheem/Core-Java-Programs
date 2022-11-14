package com.polymorphism;

public class OverLoading2 {
	
	void add(int a,int b) {
		System.out.println("int arg is invoked");
	}
	
	void add(long a,long b) {
		System.out.println("long is arg is invoked");
	}

	 public static void main(String[] args) {
		OverLoading obj=new OverLoading();
		obj.add(12,221);
	}
}
