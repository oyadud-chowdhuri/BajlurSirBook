package BajlurSirBookPractice;

import java.util.Scanner;

public class SumNumberUsingOperator {
	public static void main(String[] args) {

		Scanner input = new Scanner (System.in);
		System.out.println("Please Choose an operator : +, - ,* or / :");
		
		char operator = input.next().charAt(0);
		
		System.out.println("Enter first number");
		int num1 = input.nextInt();
		
		System.out.println("Enter second number");
		int num2 = input.nextInt();
		
		int result = switch(operator) {
			case '+' -> num1 + num2;
			case '-' -> num1 - num2;
			case '*' -> num1 * num2;
			case '/' -> num1 / num2;
			default -> {
				System.out.println("Invalid operator !");
				yield 0;
			}
		};
		
		System.out.println("Result = "+ result);
}
}
