package com.masai.arrays;

import java.math.BigDecimal;

public class StudentRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int[] marks = {97,99,100};
		
		Student student = new Student("Mohan", 97,99,100);
		
		Student student1 = new Student("Sohan", 96,85,100);
//		System.out.println(student1);
		Student student2 = new Student("Rohan", 100,89,89,91);
//		System.out.println(student2);
		
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
		
		System.out.println(student);
		
		
		student.addNewMarks(35);
		student.removeMarksAtIndex(2);

		
		System.out.println(student);
		
		
		

	}

}
