package com.masai.arrays;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Student {
	
	private String name;
	private int[] marks;
	
	
	public Student(String name, int[] marks) {
		this.name = name;
		this.marks = marks;
	}


	public int getNumberOfMarks() {
		return marks.length;
	}


	public int getTotalSumOfMarks() {
		int sum = 0;
//		for(int i = 0; i < marks.length; i++) {
//			sum = sum + marks[i]
//		}
		
		for(int x : marks) {
			sum = sum + x;
		}
		return sum;
	}


	public int getMaximumMarks() {
		int maximum = Integer.MIN_VALUE;
		for(int x : marks) {
			if(x > maximum) {
				maximum = x;
			}
		}
		return maximum;
	}


	public int getMinimumMarks() {
		int minimum = Integer.MAX_VALUE;
		for(int x : marks) {
			if(x < minimum) {
				minimum = x;
			}
		}
		return minimum;
	}


	public BigDecimal getAverageMarks() {
		int sum = getTotalSumOfMarks();
		int x = getNumberOfMarks();
		
		BigDecimal result = new BigDecimal(sum)
				.divide(new BigDecimal(x), 3, RoundingMode.UP);
		return result;
	}
}
