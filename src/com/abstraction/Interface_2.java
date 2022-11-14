package com.abstraction;

interface Printable{
	 int print(int a,int b);
}
public class Interface_2 implements Printable{

	@Override
	public  int print(int a,int b) {
       int str=a*b;
       return str;

	}
	public static void main(String[] args) {
		Printable pr=new Interface_2();
		System.out.println("print statement: "+pr.print(2, 4));
	}
	

}
