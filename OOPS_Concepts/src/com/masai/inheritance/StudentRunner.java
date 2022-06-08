package com.masai.inheritance;

public class StudentRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person person = new Person();
//		System.out.println(person);
		
		
		Student student = new Student();
		
		student.setCollege("XYZ");
		student.setName("Ramu");
		student.setEmail("ramu@gmail.com");
		
		System.out.println(student);
		
		
		Employee ramdheer = new Employee();
		
		ramdheer.setName("Ramdheer");
		ramdheer.setEmployerName("wasseypuy");
		ramdheer.setTitle("Criminal");;
		ramdheer.setEmail("ramdheer@wasseypuy.com");
		
		System.out.println(ramdheer);
		
	}

}
