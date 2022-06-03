package com.masai.string;

public class MyChar {
	private char ch;
	

	public MyChar(char ch) {
		// TODO Auto-generated constructor stub
		this.ch = ch;
	}


	public boolean isVowel() {
		if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||
				ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U') {
			return true;
		}
		{
			return false;
		}
		
	}


	public boolean isAlphabet() {
		if((ch >='a' && ch<='z') || (ch >='A' && ch<='Z')) {
			return true;
		}
		{
			return false;
		}
	}


	public boolean isAlphabetWithValue() {
//		A = 65, Z = 90, a = 97, z = 112;
		if((ch >=65 && ch <=90) || (ch >= 97 && ch <= 122)) {
			return true;
		}
		{
			return false;
		}
	}


	public boolean isConsonant() {
		if(isAlphabet() && !isVowel()) {
			return true;
		}
		{
			return false;
		}
	}


	public boolean isDigit() {
		if(ch >= 48 && ch <= 57) {
			return true;
		} {
			return false;
		}
	}
	
}
