package com.masai.oops;

import com.masai.java.MoterBike;

public class MoterBikeRunner {
public static void main(String[] args) {
		
		MoterBike ducati = new MoterBike();
		MoterBike honda = new MoterBike();
		MoterBike bullet = new MoterBike();
		
		
		System.out.println("Bullet Speed => " +bullet.getSpeed());
		
		ducati.start();
		honda.start();
		
		System.out.println("ducati Speed => " +ducati.getSpeed());
		System.out.println("Honda Speed => " +honda.getSpeed());
		//Encapsulation
		ducati.setSpeed(100);
		honda.setSpeed(50);
		
//		int ducatiSpeed = ducati.getSpeed();
//		ducatiSpeed = ducatiSpeed + 100;
//		ducati.setSpeed(ducatiSpeed);
//		
//		
//		int hondaSpeed = honda.getSpeed();
//		hondaSpeed = hondaSpeed + 100;
//		honda.setSpeed(hondaSpeed);
		
		ducati.increaseSpeed(200);
		honda.increaseSpeed(200);
		
		ducati.decreaseSpeed(100);
		honda.decreaseSpeed(100);
		
		System.out.println("ducati Speed => " +ducati.getSpeed());
		System.out.println("Honda Speed => " +honda.getSpeed());}
}
