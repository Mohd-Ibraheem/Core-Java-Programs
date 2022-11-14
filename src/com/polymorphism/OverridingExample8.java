package com.polymorphism;

class Hublet{
	
	void display()throws Exception{
		System.out.println("invoked parent display");
	}
}

public class OverridingExample8 extends Hublet{
	
	void display()throws ArithmeticException{
		System.out.println("invoked child display");
	}
	
	public static void main(String[] args) {
		Hublet hb=new OverridingExample8();
		
		try {
			hb.display();
		}
		catch (Exception e) {
			// TODO: handle exception
		}
	}

}
