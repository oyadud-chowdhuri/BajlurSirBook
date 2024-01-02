package BajlurSirBookPractice;

import java.util.Scanner;

public class GuessingGame {
	public static void main(String[] args) {
		int number = 15;
		
		Scanner input = new Scanner(System.in);
		
		int guess;
		
		do {
			System.out.println("Guess a number");
			guess = input.nextInt();
			
			if(number == guess) {
				System.out.println("Congratulatios!!!!!, You Guess the number correctly....");
			}else if(number > guess){
				System.out.println("Number is greater than your guessing number");
				
			}else {
				System.out.println("Number is less than your guessing number");
			}
;			
		}while(guess != number);
	}
}
