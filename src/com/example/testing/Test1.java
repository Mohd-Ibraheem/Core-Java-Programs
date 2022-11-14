package com.example.testing;

public class Test1 {
	
	Test1(){
		/*cannot assign a value to final variable this
		the compiler error will be shown*/
		
	//	this.null;
		System.out.println("Test class constructor called");
	}
	
	public static void main(String[]args) {
		Test1 t=new Test1();
	}

}
