package com.polymorphism;

public class OverLoading7 {
	static int id(int a) {
		return 10;
	}

	static int id(int a, int b) {
		return 'a';
	}
	public static void main(String[] args) {
		System.out.println(OverLoading7.id(1));
		System.out.println(OverLoading7.id(1,2));
	}
}
