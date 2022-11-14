package com.inheritance;

interface A {

	void eat(); 
}

interface B {
	void run();
}

class C implements A, B {

	@Override
	public void run() {
		System.out.println("i am running");

	}

	@Override
	public void eat() {
		System.out.println("i am eating");

	}

	public static void main(String[] args) {
		C c1 = new C();
		c1.eat();
		c1.run();
	}

}
