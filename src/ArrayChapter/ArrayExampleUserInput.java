package ArrayChapter;

import java.util.Scanner;

public class ArrayExampleUserInput {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter the length of array : ");
		
		int sizeOfArray = input.nextInt();
		
		int [] numbers = new int [sizeOfArray];
		
		for(int i =0; i<numbers.length;i++) {
			System.out.print(i + " ");
			numbers[i] = input.nextInt();
			
		}
		System.out.println("index\tvalue");
		for(int i = 0; i<numbers.length;i++) {
			System.out.println(i+ "\t" +numbers[i]);
		}
		

	}
}
