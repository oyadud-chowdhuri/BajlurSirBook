package com.object;

public class CodeDuplicationPersonDemo {
	public static void main(String[] args) {
		CodeDuplicationPerson person1 = new CodeDuplicationPerson("Rashon Chowdhury");
		CodeDuplicationPerson  person2 = new CodeDuplicationPerson("Chowdhuri Oyadud", "ABC@gmail.com");
		CodeDuplicationPerson person3 = new CodeDuplicationPerson("Chowdhuri Oyadud", "ABC@gmail.com", 25);
		
		person1.printInfo();
		person2.printInfo();
		person3.printInfo();
	}
}
