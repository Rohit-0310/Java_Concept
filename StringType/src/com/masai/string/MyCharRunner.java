package com.masai.string;

public class MyCharRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MyChar myChar = new MyChar('B');
		
		System.out.println(myChar.isVowel());
		
		System.out.println(myChar.isAlphabet());
		
		System.out.println(myChar.isAlphabetWithValue());
		
		System.out.println(myChar.isConsonant());
		
		System.out.println(myChar.isDigit());
		
		MyChar.printLowerCaseAlphabet(); //Static Method
		
		System.out.println("");
		
		MyChar.printUpperCaseAlphabet(); //Static Method
	}

}
