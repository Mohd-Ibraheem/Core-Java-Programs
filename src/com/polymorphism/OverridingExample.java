package com.polymorphism;

class Vahicle{
	void run(){
		System.out.println("vehicle is running");
	}
}

public class OverridingExample extends Vahicle {
	
	void run() {
		System.out.println("Train is running safely");
	}
	public static void main(String[] args) {
		OverridingExample oe=new OverridingExample();
		oe.run();
	}

}
