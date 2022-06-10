package com.masai.learncollections;

import java.util.HashMap;
import java.util.Map;

public class MapRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = "This is our last session in java covered in 10 days. This has ";
		
		
		//Occurence of Characters
		
		Map<Character,Integer> occurence = new HashMap<>();
		char[] characters = str.toCharArray();
		
		for(char character: characters)
		{
			Integer value = occurence.get(character);
			if(value == null)
			{
				occurence.put(character,1);
			}else {
				occurence.put(character, value + 1);
			}
		}
		System.out.println(occurence);

	}

}
