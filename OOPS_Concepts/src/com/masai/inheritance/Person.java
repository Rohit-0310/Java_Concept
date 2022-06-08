package com.masai.inheritance;

public class Person extends Object {
	private String name;
	private String email;
	private String phoneNumber;
	
	
	public Person() {
		System.out.println("Bhai, -I am inside Person");
	}

	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	
	public String toString() {
		return getName()+" " + getEmail() + " "+ getPhoneNumber() + " ";
	}
	
}
