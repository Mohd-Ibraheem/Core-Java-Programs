package com.polymorphism;

class Parent{
	void show(){
		System.out.println("Parent is show()");
	}
}
public class OverridingExample2 extends Parent {
	
	void show() {
		System.out.println("Child is show()");
	}
	public static void main(String[] args) {
		Parent oe = new OverridingExample2();
		oe.show();
	}

}
