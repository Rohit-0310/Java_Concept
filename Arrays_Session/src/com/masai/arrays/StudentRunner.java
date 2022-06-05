package com.masai.arrays;

import java.math.BigDecimal;

public class StudentRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] marks = {97,99,100};
		
		Student student = new Student("Mohan", marks);
		
		int number = student.getNumberOfMarks();
		System.out.println("Number Of Marks"+ number);
		
		int maxMarks = student.getMaximumMarks();
		System.out.println("Sum of Marks"+ maxMarks);
		
		int mimMarks = student.getMinimumMarks();
		System.out.println("Sum of Marks"+ minMarks);
		
		
		BigDecimal average = student.getAverageMarks();
		
		

	}

}
