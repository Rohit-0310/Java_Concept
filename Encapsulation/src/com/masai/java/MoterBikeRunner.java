package com.masai.java;

public class MoterBikeRunner {
	public static void main(String[] args) {
		
		MoterBike ducati = new MoterBike();
		MoterBike honda = new MoterBike();
		ducati.start();
		honda.start();
		
		
		//Encapsulation
		ducati.setSpeed(180);
		honda.setSpeed(170);
		
		System.out.println("ducati " +ducati.getSpeed());
		System.out.println("ducati " +honda.getSpeed());
		
		
		
		
		
	}
}
