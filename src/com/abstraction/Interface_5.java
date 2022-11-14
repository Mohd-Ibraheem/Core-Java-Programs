package com.abstraction;
 
interface Student{
	void getName(String name);
}
public class Interface_5 implements Student{

	@Override
	public void getName(String name) {
		System.out.println("Student name is:"+name);
	}
public static void main(String[] args) {
	Student s1=new Interface_5();
	s1.getName("Mohammad Ibraheem");
}
}
