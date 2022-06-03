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
	
}
