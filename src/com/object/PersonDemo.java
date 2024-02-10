package com.object;

public class PersonDemo {
	public static void main(String[] args) {
		Person person1 = new Person("Rashon Chowdhury");
		Person person2 = new Person("Chowdhuri Oyadud", "ABC@gmail.com");
		Person person3 = new Person("Chowdhuri Oyadud", "ABC@gmail.com", 25);
		
		person1.printInfo();
		person2.printInfo();
		person3.printInfo();
	}
}
