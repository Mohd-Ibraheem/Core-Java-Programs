package com.constructor;

public class Constructo {
	
	int id;
	String name;
	
	
	void dislpay() {
		System.out.println(id+" "+name);
	}
	
	public static void main(String[] args) {
		Constructo c=new Constructo();
		        c.dislpay();
	}

}
