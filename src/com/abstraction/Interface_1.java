package com.abstraction;

interface Language{
	void show();
}
public class Interface_1 implements Language{

	@Override
	public void show() {
		System.out.println("invoked show ():");
	}
	public static void main(String[] args) {
		Language lg=new Interface_1();
		lg.show();
	}

}
