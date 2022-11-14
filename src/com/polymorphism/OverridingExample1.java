package com.polymorphism;

class Bank {
	int getRateOfInterest() {
		return 0;
	}
}

class SBI extends Bank {
	int getRateOfInterest() {
		return 8;
	}
}

class ICICI extends Bank {
	int getRateOfInterest() {
		return 7;
	}
}

class OverridingExample1 extends Bank {
	int getRateOfInterest() {
		return 9;
	}

	public static void main(String args[]) {
		SBI s = new SBI();
		ICICI i = new ICICI();
		OverridingExample1 a = new OverridingExample1();

		System.out.println("SBI Rate of Interest: " + s.getRateOfInterest());
		System.out.println("ICICI Rate of Interest: " + i.getRateOfInterest());
		System.out.println("AXIS Rate of Interest: " + a.getRateOfInterest());
	}
}
