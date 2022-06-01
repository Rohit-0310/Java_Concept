package com.masai.java;

public class MoterBike {
	//State
	private int speed;
	
	//Behaviour
	void start() {
		System.out.println("Bike started");
	}

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}
	
	
}
