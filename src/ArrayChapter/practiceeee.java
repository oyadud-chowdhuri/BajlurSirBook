package ArrayChapter;

import java.util.Scanner;

public class practiceeee {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String value = input.nextLine();
//		System.out.println("Value = " + value);
		
		value = value.toLowerCase();
		
		char [] letters = value.toCharArray();
		
		for(int i =0; i<letters.length;i++) {
			
			int asciivalue = (int)letters[i];
			
			System.out.println(letters[i]+" = "+ asciivalue );
		}
		
		
		
	}
}
