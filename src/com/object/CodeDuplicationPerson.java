package com.object;

//Code Duplication prevent using constructor change

public class CodeDuplicationPerson {
	private String name;
	private String email;
	private int age;
	
	public CodeDuplicationPerson(String name) {
		this.name= name;
	}
	public CodeDuplicationPerson(String name, String email) {
		this(name);
		this.email = email;
		
	}
	public CodeDuplicationPerson(String name, String email, int age) {
		this(name,email);
		this.age = age;
		
	}
	
	public void printInfo() {
		System.out.println("Name: " + name);
		System.out.println("Email: " + email);
		System.out.println("Age: " + age);
	}
}
