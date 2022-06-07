package com.masai.arrays;

public class StringRunner {

	public static void main(String[] args) {
		String[] daysOfWeek = {"Monday", "Tuesday", "Wednesday"
		,"Thursday","Friday", "Saturday","Sunday"
		};
		
		String daysWithMostCharacter = "";
		for(String day : daysOfWeek) {
			if(day.length() > daysWithMostCharacter.length()) {
				daysWithMostCharacter = day;
			}
		}
		
		System.out.println("Days With Most Character-> "+ daysWithMostCharacter);

	}

}
