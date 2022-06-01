package com.masai.java;

public class MoterBikeRunner {
	public static void main(String[] args) {
		
		MoterBike ducati = new MoterBike();
		MoterBike honda = new MoterBike();
		ducati.start();
		honda.start();
		
		
		//Encapsulation
		ducati.setSpeed(50);
		honda.setSpeed(80);
		
		int ducatiSpeed = ducati.getSpeed();
		ducatiSpeed = ducatiSpeed + 100;
		ducati.setSpeed(ducatiSpeed);
		
		
		int hondaSpeed = honda.getSpeed();
		hondaSpeed = hondaSpeed + 100;
		honda.setSpeed(hondaSpeed);
		
		System.out.println("ducati Speed => " +ducati.getSpeed());
		System.out.println("ducati Speed => " +honda.getSpeed());
		
		
		
		
		
	}
}
