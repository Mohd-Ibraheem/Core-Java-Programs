package com.polymorphism;

public class OverLoading6 {
	public static void main(int args) {
		System.out.println("main()overloaded"+"method 1 executing");
	}

	public static void main(String args) {
		System.out.println("main()overloaded"+"method 2 executing");
	}
	
	public static void main(double args) {
		System.out.println("main()overloaded"+"mothed 3 executing");
	}
	public static void main(String[] args) {
		System.out.println("original main()"+"executing");
	}
}
