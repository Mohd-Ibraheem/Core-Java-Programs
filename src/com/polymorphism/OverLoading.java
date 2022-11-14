package com.polymorphism;

public class OverLoading {
	
	static int add(int a,int b) {
		return a=b;
	}
	
	static int add(int a,int b,int c) {
		return a+b+c;
	}
	
	public static void main(String[] args) {
		
		//by calling object creation
		
		/*
		 * OverLoading vl = new OverLoading(); System.out.println(vl.add(12, 15));
		 * System.out.println(vl.add(10, 20, 30));
		 */
		System.out.println(OverLoading.add(20, 20));
		System.out.println(OverLoading.add(12, 10, 1));
	}

}
