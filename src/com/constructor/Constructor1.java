package com.constructor;

public class Constructor1 {
	
	int id;
	String name;
	String address;
	
	
	public Constructor1(int id, String name, String address) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
	}
	void display() {
		System.out.println(id+" "+name+" "+address);
	}

	public static void main(String[] args) {
		Constructor1 Constructor1 = new Constructor1(121,"Ibraheem","Mumbra");
		    Constructor1.display();
	}
}
