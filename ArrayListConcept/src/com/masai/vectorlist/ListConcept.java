package com.masai.vectorlist;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

public class ListConcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<String> words = List.of("Apple", "Cat", "Bat");
		
		List<String> vector = new Vector<String>(words);
		List<String> arrList = new ArrayList<String>(words);
		
		
		arrList.add("Elephant");
		System.out.println("Vector List-> "+ vector);
		System.out.println(arrList);

	}

}
