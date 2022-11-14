package com.abstraction;

abstract class Mango {
	abstract void show();
}

class Apple1 extends Mango{
	@Override
	void show() {
		System.out.println("invoked show");
	}
}

public class Abstract_1 extends Mango{

	@Override
	void show() {
		System.out.println("show my properties");
		
	}
	
	public static void main(String[] args) {
		Mango m=new Abstract_1();
		m.show();
	}

}
