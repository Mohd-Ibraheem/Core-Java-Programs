package com.abstraction;

abstract class Hourse {
	int id;
	String name;

	public Hourse(int id, String name) {
		this.id = id;
		this.name = name;

	}

	void display() {
		System.out.println("Id:" + id + "  Name:" + name);
	}

	static void m7() {
		System.out.println("invoked static method");
	}

	abstract void run();

	void m1() {
		System.out.println("read my context");
	}
}

public class Abstrcat_3 extends Hourse {

	public Abstrcat_3(int id, String name) {
		super(id, name);
		// TODO Auto-generated constructor stub
	}

	@Override
	void run() {
		System.out.println("Running safely");

	}

	public static void main(String[] args) {
		Hourse.m7();
		Hourse h1 = new Abstrcat_3(121, "Ibraheem");
		h1.run();
		h1.m1();
		h1.display();
	}

}
