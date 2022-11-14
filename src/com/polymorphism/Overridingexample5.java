package com.polymorphism;

import java.io.IOException;

class TataSky {
	void show() throws IOException {
		System.out.println("i am fly in the sky");
	}
}

public class Overridingexample5 extends TataSky {

	void show() throws IOException {
		System.out.println("test exception child");
	}

	public static void main(String[] args) throws IOException {
		TataSky oe = new Overridingexample5();
		oe.show();
	}

}
