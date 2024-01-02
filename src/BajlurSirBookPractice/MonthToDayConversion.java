package BajlurSirBookPractice;

import java.util.Scanner;

public class MonthToDayConversion {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Please enter a month");	
		
		int month = input.nextInt();
		
		int days = switch (month) {
		case 1, 3,5,7,8,10,12 -> 31;
		case 4,6,9,11 -> 30;
		case 2 -> {
			System.out.println("Please enter the year");
			
			int year = input.nextInt();
			
			if (year % 4 == 0) {
				yield 29;
			}else {
				yield 28;
			}
		} 
		default -> 0;
		};
		System.out.println("The month have "+days+" Days");
	}
}
