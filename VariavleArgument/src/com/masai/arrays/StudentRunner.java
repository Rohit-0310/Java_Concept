package com.masai.arrays;

import java.math.BigDecimal;

public class StudentRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int[] marks = {97,99,100};
		
		Student student = new Student("Mohan", 97,99,100);
		
		int number = student.getNumberOfMarks();
		System.out.println("Number Of Marks "+ number);
		
		int sum = student.getTotalSumOfMarks();
		System.out.println("Sum of Marks "+ sum);
		
		int maxMark = student.getMaximumMarks();
		System.out.println("Max Marks "+ maxMark);
		
		int minMark = student.getMinimumMarks();
		System.out.println("Minimum Marks "+ minMark);
		
		
		BigDecimal average = student.getAverageMarks();
		System.out.println("Average Marks "+ average);
		

	}

}
