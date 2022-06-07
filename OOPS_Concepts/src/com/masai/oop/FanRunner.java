package com.masai.oop;

public class FanRunner {

	public static void main(String[] args) {

		Fan fan = new Fan("Bajaj", 0.34567,"Green");
		fan.switchOn();
		System.out.println("After Fan Switch is On"+fan);
		fan.switchOff();
		System.out.println("After Fan Switch is Off"+fan);

	}
	

}
