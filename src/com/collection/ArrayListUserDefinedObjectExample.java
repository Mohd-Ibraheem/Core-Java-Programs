package com.collection;

import java.util.ArrayList;
import java.util.List;

class User{
	
	private int id;
	private String name;
	private String address;
	
	public User(int id,String name,String address) {
		this.id=id;
		this.name=name;
		this.address=address;
		
	}
	
	public void setId(int id) {
		this.id=id;
	}
	public int getId() {
		return id;
	}
	
	public void setName(String name) {
		this.name=name;
	}
	
	public String getName() {
		return name;
	}
	
	public void setAddress(String address) {
		this.address=address;
	}
	public String getAddress() {
		return address;
	}
}

public class ArrayListUserDefinedObjectExample {
	
	public static void main(String[] args) {
		List<User> s=new ArrayList<>();
		
		s.add(new User(21, "Amir Bhai", "SakiNaka"));
		s.add(new User(22, "Ibraheem", "Mumbra"));
		s.add(new User(23, "Rehan", "Kurla"));
		
		s.forEach(user ->{
			System.out.println("id: "+user.getId()+","+"name: "+user.getName()+","+"adress: "+user.getAddress());
		});
		//System.out.println("name :"+s.get);
	}

}
