package com.aggregation;

public class Employee {
	int id;
	String name;
	Address address;
	
	public Employee(int id, String name, Address address) {
		
		this.id = id;
		this.name = name;
		this.address = address;
	}
	void display(){  
		System.out.println(id+" "+name);  
		System.out.println(address.city+" "+address.state+" "+address.country);  
		}  
		  
		public static void main(String[] args) {  
		Address ad=new Address("gzb","UP","India");
		Address ad1=new Address("Basti","UP","India");
		
		  
		Employee e=new Employee(111,"Ibraheem",ad);	
		Employee e1=new Employee(121, "Raihan", ad1);
		
		      
		e.display();
		e1.display();
		
		      
		
		}  
	

}
