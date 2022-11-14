package com.example.testing;

//yes we can constructor chaining be done using this keyword!!
public class Test2 {

	int id, age;
	String name, address;

	public Test2(int age) {
		this.age = age;
	}

	public Test2(int id, int age) {
		this(age);
		this.id = id;
	}

	public Test2(int id, int age, String name, String address) {
		this(id, age);
		this.name = name;
		this.address = address;
	}

	public static void main(String args[]) {
		Test2 t1 = new Test2(105, 22, "Ibraheem", "Mumbra");
		System.out.println("ID: " + t1.id + " Name:" + t1.name + " age:" + t1.age + " address: " + t1.address);
	}

}
