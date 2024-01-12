package BajlurSirBookPractice;

import java.util.Scanner;

public class primeFactorization {
	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		System.err.println("Enter a Number ");
		long n = input.nextLong();
		
		System.out.println("Prime Factors of "+ n +" Are: ");
		
		for(long i = 2; i<n/i; i++) {
			while( n% i== 0 ) {
				System.out.println(i + " ");
				
				n = n/ i;
			}
		}
		
		if (n>1) {
			System.out.println(n);
		}
		
	}
}
