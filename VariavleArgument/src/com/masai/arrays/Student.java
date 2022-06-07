package com.masai.arrays;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.Collections;

public class Student {
	
	private String name;
	private ArrayList<Integer> marks = new ArrayList<Integer>();
	
	
	public Student(String name, int... marks) {
		this.name = name;
		for(int mark : marks) {
			
			this.marks.add(mark);
		}
	}


	public int getNumberOfMarks() {
		return marks.size();
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
		return Collections.max(marks);
//		int maximum = Integer.MIN_VALUE;
//		for(int x : marks) {
//			if(x > maximum) {
//				maximum = x;
//			}
//		}
//		return maximum;
	}


	public int getMinimumMarks() {
		return Collections.min(marks);
//		int minimum = Integer.MAX_VALUE;
//		for(int x : marks) {
//			if(x < minimum) {
//				minimum = x;
//			}
//		}
//		return minimum;
	}


	public BigDecimal getAverageMarks() {
		int sum = getTotalSumOfMarks();
		int x = getNumberOfMarks();
		
		BigDecimal result = new BigDecimal(sum)
				.divide(new BigDecimal(x), 3, RoundingMode.UP);
		return result;
	}
//	public
}
