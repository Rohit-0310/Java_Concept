package com.masai.oop;

public class BookRunner {

	public static void main(String[] args) {


		Book book = new Book("123", "OOP in JAVA", "Jonny");
			
		Review review1 = new Review(10,"Awsome Book",5);
		Review review2 = new Review(11,"Great Book",5);
			book.addReview(review1);
			book.addReview(review2);
		
			System.out.println(book);
	
	}
	
	

}
