package com.abstraction;

interface A1{
	void m1();
}

interface B1{
	void m2();
}
public class Interface_3 implements A1,B1{

	@Override
	public void m2() {
		System.out.println("invoked parent method m1()");
	}

	@Override
	public void m1() {
		System.out.println("invoked parent method m2()");
	}
	public static void main(String[] args) {
		Interface_3 in=new Interface_3();
		in.m1();
		in.m2();
	}

}
