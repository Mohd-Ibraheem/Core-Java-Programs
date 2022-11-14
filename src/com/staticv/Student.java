package com.staticv;

public class Student {

	int id;
	String name;
	static String college = "Choice College of Arts and Commerce";

	Student(int i, String n) {
		id = i;
		name = n;

	}

	void display() {
		System.out.println(id + " " + name + " " + college);
	}

	public static void main(String[] args) {
		Student s1 = new Student(101, "Ibraheem");
		Student s2 = new Student(102, "Uzair");
		Student s3 = new Student(103, "Kiaf");

		s1.display();
		s2.display();
		s3.display();

	}

}
