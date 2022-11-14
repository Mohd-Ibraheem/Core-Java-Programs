package com.polymorphism;

import java.io.*;

public class OverLoading4 {
	
	public  int multiply(int a,int b) {
		int in=a*b;
		return in;
	}
	 
	 public int multiply(int a,int b,int c) {
		 int in=a*b*c;
		 return in;
		 
	 }
	 
	 public static void main(String[] args) {
		OverLoading4 obj = new OverLoading4();
	   System.out.println(obj.multiply(12, 2));
	   System.out.println(obj.multiply(2, 3, 2));
	}

}
