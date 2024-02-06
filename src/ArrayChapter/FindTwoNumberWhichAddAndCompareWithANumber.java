package ArrayChapter;

import java.util.Arrays;
import java.util.Scanner;

public class FindTwoNumberWhichAddAndCompareWithANumber {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int [] array = new int[10];
		
		int givenNum;
		System.out.println("Please enter array value..");
		for(int i =0;i<array.length;i++) {
			array[i]= input.nextInt();
		}
		
		System.out.println(Arrays.toString(array));
		System.out.println("Please enter the  number");
		
		givenNum = input.nextInt();
		
		System.out.println("YOur Given number is "+ givenNum);
		
		for(int i = 0;i<array.length;i++) {
			
			for(int j = i+1;j<array.length;j++) {
				if(array[i]+array[j]==givenNum) {
					
					System.out.println("First Number is :" + array[i]);
					System.out.println("Second Number is :" + array[j]);
				}
			}
		}
		
		
		
	}
}
