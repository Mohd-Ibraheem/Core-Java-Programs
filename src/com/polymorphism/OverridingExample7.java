package com.polymorphism;

class Centre {
	void show() throws Exception {
		System.out.println("Hii");
	}
}

public class OverridingExample7 extends Centre {

	void show() throws Exception {
		System.out.println("hello");
	}

	public static void main(String[] args) {
		Centre c = new OverridingExample7();

		try {
			c.show();
		} catch (Exception e) {

		}
	}

}
