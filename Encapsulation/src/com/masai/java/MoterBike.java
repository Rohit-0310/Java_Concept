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
		if(speed > 0) {
			this.speed = speed;			
		}
	}
	
	
	public void increaseSpeed(int howMuch) {
		if(howMuch >= 0) {
			this.speed = this.speed + howMuch;			
		}
	}
	
	public void decreaseSpeed(int howMuch) {
		if(this.speed - howMuch >= 0 && howMuch >= 0) {
			this.speed = this.speed - howMuch;
		}
	}
	
	
}
