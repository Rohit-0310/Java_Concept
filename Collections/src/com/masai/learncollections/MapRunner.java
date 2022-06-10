package com.masai.learncollections;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = "This is our last session in java covered in 10 days. This has ";
		
		
		//Occurrence of Characters
		
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
		
		
		//Occurrence of Word
		
				Map<String,Integer> count = new TreeMap<>();
				String[] words = str.split(" ");
				
				for(String word: words)
				{
					Integer value = count.get(word);
					if(value == null)
					{
						count.put(word,1);
					}else {
						count.put(word, value + 1);
					}
				}
				System.out.println(count);


	}

}
