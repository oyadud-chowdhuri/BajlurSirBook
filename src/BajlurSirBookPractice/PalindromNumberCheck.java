package BajlurSirBookPractice;

import java.util.Scanner;

public class PalindromNumberCheck {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Please enter a number ");
		
		int givenNumber = input.nextInt();
		
		int num = givenNumber;
		
		int temp = 0 ;
		int r;
		while(num != 0) {
			r = num % 10;
			temp = temp*10 + r;
			num = num/10;
		}
		
		if(givenNumber == temp) {
			System.out.println("Given number : "+ givenNumber+" is a palindrom number");
		}else {
			System.out.println("Given number : "+ givenNumber+" is not  a palindrom number");
		}
		
	}
}
