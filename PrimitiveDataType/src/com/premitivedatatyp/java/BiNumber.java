package com.premitivedatatyp.java;

public class BiNumber {
	private int number1;
	private int number2;
	
	

	public BiNumber(int i, int j) {
		// TODO Auto-generated constructor stub
			this.number1 = i;
			this.number2 = j;
	}



	public int add() {
		// TODO Auto-generated method stub
		return this.number1 + this.number2;
	}



	public int multiply() {
		// TODO Auto-generated method stub
		return this.number1 * this.number2;
	}



	public void doubleValue() {
		// TODO Auto-generated method stub
		this.number1 *=2;
		this.number2 *=2;
		
	}



	public int getNumber1() {
		return number1;
	}



	public void setNumber1(int number1) {
		this.number1 = number1;
	}



	public int getNumber2() {
		return number2;
	}



	public void setNumber2(int number2) {
		this.number2 = number2;
	}

}
