package com.example.testing;

class Person{
	
	int id;
	int age;
	String name;
	
	public Person(int id,int age,String name) {
		this.id=id;
		this.age=age;
		this.name=name;
		
	}
}
public class Employee extends Person{
	
       float salary;
       
	public Employee(int id, int age, String name,float salary) {
		
		super(id, age, name);
		this.salary=salary;
		
	}
	public static void main(String[] args) {
		Employee e=new Employee(212,22,"Ibraheem",30000);
		System.out.println("Name:"+e.id+"Age:"+e.age+"Name:"+e.name+"Salary:"+e.salary);
		}

}
