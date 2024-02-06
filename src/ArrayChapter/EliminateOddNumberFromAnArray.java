package ArrayChapter;

import java.util.Arrays;
import java.util.Scanner;

public class EliminateOddNumberFromAnArray {
	public static void main(String[] args) {
		
		Scanner input = new Scanner (System.in);
		
		System.out.println("Please enter array size");
		int size = input.nextInt();
		
		int [] array =  new int[size];
		System.out.println("Please enter array element..");
		
		for(int i=0;i<array.length;i++) {
			array[i]= input.nextInt();
		}
		System.out.println(Arrays.toString(array));
		
		int count=0;
		int [] newarr = new int[size];
		
		for(int i=0;i<array.length;i++) {
			if(array[i]%2 ==0) {
				newarr[count] = array[i];
				count++;
			}
		}
		newarr =Arrays.copyOfRange(newarr, 0, count);
		System.out.println("Only Even Number");
		
		System.out.println(Arrays.toString(newarr));
		
		
	}
}
