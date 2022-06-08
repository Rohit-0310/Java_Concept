package com.masai.oop;

public class CustomerRunner {

	public static void main(String[] args) {
		Address homeAddress = new Address("Lajpat Nagar", "New Delhi", "345678");
		Customer customer = new Customer("Raja", homeAddress);
		System.out.println(customer);

	}

}
