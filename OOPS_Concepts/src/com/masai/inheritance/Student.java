package com.masai.inheritance;

public class Student extends Person{
	private String collegr;
	private int year;
	
	
	
	public String getCollegr() {
		return collegr;
	}
	public void setCollegr(String collegr) {
		this.collegr = collegr;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	
	
	public String toString() {
		return collegr + " " + year;
	}
	
	
}
