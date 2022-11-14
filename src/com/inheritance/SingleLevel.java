package com.inheritance;

class Animal {
	
	void m1() {
		System.out.println("iPhone");
	}
}
class SingleLevel extends Animal{
	void m2() {
		System.out.println("lenovo");
	}

	public static void main(String[] args) {
		SingleLevel a=new SingleLevel();
		a.m1();
		a.m2();
	
}
}
