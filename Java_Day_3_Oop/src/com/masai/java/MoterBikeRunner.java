package com.masai.java;

public class MoterBikeRunner {
	public static void main(String[] args) {
		MoterBike ducati = new MoterBike();
		MoterBike honda = new MoterBike();
		ducati.start();
		honda.start();
		
		ducati.speed = 100;
		honda.speed = 75;
		
		System.out.println("ducati "+ ducati.speed);
		
		System.out.println("honda "+ honda.speed);
		
		
		ducati.speed = 190;
		honda.speed = 175;
		
		System.out.println("ducati "+ ducati.speed);
		
		System.out.println("honda "+ honda.speed);
		
	}
}
