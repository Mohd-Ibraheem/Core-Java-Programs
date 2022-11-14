package com.example.testing;
//yes we can pass the static variable and method in the abstract class

abstract class Testing{
	
	static int i=121;
	static void m1() {
		System.out.println("welcome to my world");
	}
	
	public static void main(String[] args) {
		Testing.m1();
		System.out.println("i="+Testing.i);
	}
}
