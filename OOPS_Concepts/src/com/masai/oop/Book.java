package com.masai.oop;
import java.util.ArrayList;

public class Book {
	
	private String id;
	private String name;
	private String author;
	private ArrayList<Review> reviews = new ArrayList<>();
	
	
	public Book(String id, String name, String author) {

		this.id = id;
		this.name = name;
		this.author = author;
	}


	public void addReview(Review review) {
		reviews.add(review);
		
	}
	
	public String toString() {
		return id+" " + name + " "+ author+ " "+ reviews;
	}

	
	
}
