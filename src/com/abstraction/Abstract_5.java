package com.abstraction;

abstract class Lion{
	final void m1() {
		System.out.println("invoked m()method");
	}
}
public class Abstract_5 extends Lion{
	/*
	 * void m1() { System.out.println("invoked child class method"); }
	 */
	public static void main(String[] args) {
		Lion l=new Abstract_5();
		l.m1();
	}

}
