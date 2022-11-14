package com.abstraction;

interface A{
	void a();
	void b();
	void c();
	void d();
}

abstract class B implements A{
	public void b() {
		System.out.println("i am b");
	}
}
public class Abstract_4 extends B{

	@Override
	public void a() {
		System.out.println("i am a");
	}

	@Override
	public void c() {
		System.out.println("i am c");
	}

	@Override
	public void d() {
		System.out.println("i am d");
	}
	public static void main(String[] args) {
		A a=new Abstract_4();
		a.a();
		a.b();
		a.c();
		a.d();
	}

}
