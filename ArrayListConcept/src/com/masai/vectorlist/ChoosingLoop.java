package com.masai.vectorlist;

import java.util.ArrayList;
import java.util.List;

public class ChoosingLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<String> words = List.of("Apple", "Cat", "Bat");
		List<String> arrList = new ArrayList<String>(words);
		System.out.println(arrList);

		//Print thosewords ending with at
		
		for(String word : words) 
		{
			if(word.endsWith("at")) 
			{
				System.out.println(word);
			}
		}
		

	}

}
