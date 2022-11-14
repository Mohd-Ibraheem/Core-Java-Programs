package com.polymorphism;

class A{
	void print() {
		System.out.println("print my statement");
	}
}
public class Overridingexample6 extends A{
	
	void print()throws ArithmeticException{
		System.out.println("print my second statement");
	}
	public static void main(String[] args) {
		A a=new Overridingexample6();
		a.print();
	}

}
