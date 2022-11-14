package com.abstraction;
interface Test{

   int a=10;
	
	default void display() {
		System.out.println("jnjjn");
	}
}
public class Interface_8 implements Test{
	
	
	public static void main(String[] args) {
		Test t=new Interface_8();
		t.display();
	}
	
	

}
