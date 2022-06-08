package com.masai.oop;

public class CustomerRunner {

	public static void main(String[] args) {
		Address homeAddress = new Address("Patna City", "Patna, Bihar", "800007");
		
		Address workAddress = new Address("Lajpat Nagar", "New Delhi", "345678");
		Customer customer = new Customer("Raja", homeAddress,workAddress);
		System.out.println(customer);

	}

}
