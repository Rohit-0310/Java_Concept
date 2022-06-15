package com.masai.vectorlist;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ChoosingLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<String> words = List.of("Apple", "Cat", "Bat");
		List<String> arrList = new ArrayList<String>(words);
		System.out.println(arrList);

		//Print those words ending with at
		
		for(String word : words) 
		{
			if(word.endsWith("at")) 
			{
				System.out.println("ends With at-> " + word);
			}
		}
		
//		//Delete all the values which ends with at
//		//For Removing we cannot use this loop
//		for(String word : arrList) 
//		{
//			if(word.endsWith("at")) 
//			{
//				arrList.remove(word);
//			}
//		}
//		System.out.println(arrList.toString());
		

		Iterator<String> iterator = arrList.iterator();
		while(iterator.hasNext())
		{
			if(iterator.next().endsWith("at")) {
				iterator.remove();
			}
		}
		System.out.println("Iterator-> " + iterator);
	}

}
