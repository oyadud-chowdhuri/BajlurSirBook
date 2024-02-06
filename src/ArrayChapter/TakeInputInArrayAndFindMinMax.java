package ArrayChapter;

import java.util.Scanner;

public class TakeInputInArrayAndFindMinMax {
	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		System.out.println("Please enter array size");
		
		int size = input.nextInt();
		
		
		int [] array =  new int[size];
		System.out.println("Please enter array element..");
		
		for(int i=0;i<array.length;i++) {
			array[i]= input.nextInt();
		}
		int min = array[0];
		
		int max=array[0];
		
		for(int i=1;i<array.length;i++) {
			if(min>array[i]) {
				min = array[i];
			}
			if(max<array[i]) {
				max = array[i];
			}
				
		}
		
		System.out.println("Min Value is: "+ min);
		System.out.println("Max Value is: "+ max);
		
		
	}
}
