package com.polymorphism;

class Parent1{
	static void m1() {
		System.out.println("From parent m1()");
	}
	
	void m2() {
		System.out.println("From parent m2()");
	}
}
public class OverridingExample3 extends Parent{
	
	 void m1() {
		System.out.println("from child m1()");
	}
	void m2() {
		System.out.println("from child m2");
	}
	public static void main(String[] args) {
		OverridingExample3 oe = new OverridingExample3();
		oe.m1();
		oe.m2();
	}

}
