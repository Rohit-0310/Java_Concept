package com.masai.vectorlist;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Vector;

public class ListConcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<String> words = List.of("Apple", "Cat", "Bat");
//		List<String> vector = new Vector<String>(words);
//		System.out.println("Vector List-> "+ vector);
		
		List<String> arrList = new ArrayList<String>(words);
//		arrList.add("Elephant");
		System.out.println(arrList);
				
//		I : Loop
		for(int i = 0; i< words.size(); i++) {
			System.out.println("Loop " + words.get(i));
		}
		
//		 II : Enhanced Loop	
		for(String word : words) {
			System.out.println("II : Enhanced Loop	" + word);
		}
		
//		III : Iterator
		
		Iterator word = words.iterator();
		
		while(word.hasNext()) {
			System.out.println("Iterator  " + word.next());
		}
		

	}

}
