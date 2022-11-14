package com.inheritance;

class Car{
	void run() {
		System.out.println("car is to be run state");
	}
	
}
class Bike extends Car{
	void m1() {
		System.out.println("bike is running");
	}
}
 class MultiLevel extends Bike{
	 void  m2() {
		 System.out.println("this is my world");
	 }
	 
	 public static void main(String[] args) {
		MultiLevel m=new MultiLevel();
		m.run();
		m.m1();
		m.m2();
	}
}
