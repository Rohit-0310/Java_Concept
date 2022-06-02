package com.masai.oops;

public class MoterBike {
	//State
		private int speed;   //Member variable
		private String name;
		
		//constructor
		MoterBike(){
			this.speed = 50;
		}
		
		MoterBike(int speed){
			this.speed = speed;
		}
		
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
