package com.masai.inheritance;

public class Student extends Person{
	private String college;
	private int year;
	
	
	public String getCollegr() {
		return college;
	}
	public void setCollege(String college) {
		this.college = college;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	
	
	public String toString() {
		return super.getName()+ " " + college + " " + year;
	}
	
	
}
