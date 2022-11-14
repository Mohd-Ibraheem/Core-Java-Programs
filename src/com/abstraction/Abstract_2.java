package com.abstraction;

abstract class Bank {
	abstract int getRateOfInterest();
}

class SBI extends Bank {

	@Override
	int getRateOfInterest() {
		return 8;
	}

}

class ICICI extends Bank {
	int getRateOfInterest() {
		return 7;
	}

}

public class Abstract_2 extends ICICI {
	int getRateOfInterest() {
		return 9;
	}

	public static void main(String[] args) {
		Bank b;
		 b= new SBI();
		System.out.println("Rate of interest is: " + b.getRateOfInterest() + "%");
		b=new ICICI();
		System.out.println("Rate of interest is: " + b.getRateOfInterest() + "%");
		b=new Abstract_2();
		System.out.println("Rate of interest is: " + b.getRateOfInterest() + "%");
	}
}
