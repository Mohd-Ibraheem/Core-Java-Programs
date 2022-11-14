package com.polymorphism;

public class OverLoading5 {
	
	void studentId(int roll_no,String name) {
		System.out.println("Roll_No: "+roll_no+"Name: "+name);
	}
	
	void studentId(String name,int roll_no) {
		System.out.println("Name: "+name+"Roll_No: "+roll_no);
	}
	public static void main(String[] args) {
		OverLoading5 obj=new OverLoading5();
		obj.studentId(11, "Ibraheem");
		obj.studentId("Najmul", 21);
	}

}
