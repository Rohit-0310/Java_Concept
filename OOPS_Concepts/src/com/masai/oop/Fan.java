package com.masai.oop;

public class Fan {
	private String make;
	private double radius;
	private String color;
	private boolean isOn;
	private byte speed;
	
	
	public Fan(String make, double radius, String color) {
		this.make = make;
		this.radius = radius;
		this.color = color;
		
	}
	
	
	
	public String getMake() {
		return make;
	}



	public void setMake(String make) {
		this.make = make;
	}



	public double getRadius() {
		return radius;
	}



	public void setRadius(double radius) {
		this.radius = radius;
	}



	public String getColor() {
		return color;
	}



	public void setColor(String color) {
		this.color = color;
	}



	public boolean isOn() {
		return isOn;
	}



	public void setOn(boolean isOn) {
		this.isOn = isOn;
	}



	public byte getSpeed() {
		return speed;
	}



	public void setSpeed(byte speed) {
		this.speed = speed;
	}



	public void switchOn() {
		this.isOn = true;
		setSpeed((byte)5);
		
	}
	
	public void switchOff() {
		this.isOn = false;
		setSpeed((byte)0);
		
	}
	
public String toString() {
//		return make+" "+radius+" "+ color;
	return String.format("make - %s, radius - %f, color - %s, isOn -%b, speed - %d",
			make, radius, color, isOn, speed);
	}
}
