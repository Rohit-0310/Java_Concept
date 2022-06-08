package com.masai.inheritance;

import java.math.BigDecimal;

public class Employee extends  Person{
	
	private String title;
	private String employerName;
	private char employerGrade;
	private BigDecimal salery;
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getEmployerName() {
		return employerName;
	}
	public void setEmployerName(String employerName) {
		this.employerName = employerName;
	}
	public char getEmployerGrade() {
		return employerGrade;
	}
	public void setEmployerGrade(char employerGrade) {
		this.employerGrade = employerGrade;
	}
	public BigDecimal getSalery() {
		return salery;
	}
	public void setSalery(BigDecimal salery) {
		this.salery = salery;
	}

	public String toString() {
		return super.toString()+" " + title + " " + employerName;
	}
}
