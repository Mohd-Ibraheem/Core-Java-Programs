package com.polymorphism;

class Apple{
	void show()throws Exception{
		System.out.println("invoked parent ");
	}
}
public class OverridingExample9 extends Apple{
	
	void show() {
		System.out.println("invoked itself");
	}

	public static void main(String[] args) {
		Apple p=new OverridingExample9();
		try {
			p.show();
		}
		catch (Exception e) {
			// TODO: handle exception
		}
	}
}
