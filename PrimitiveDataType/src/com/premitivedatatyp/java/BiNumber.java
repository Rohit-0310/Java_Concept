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

}
