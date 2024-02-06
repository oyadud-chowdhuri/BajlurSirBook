package ArrayChapter;

import java.util.Arrays;
import java.util.Scanner;

public class TakeUserInputAndSort {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int cons;
		System.out.println("Please input the size of array :");
		
		int size = input.nextInt();
		int [] array = new int [size];
		
		System.out.println("Please enter the Array elements.....");
		for(int iput=0; iput<array.length;iput++) {
			array[iput]= input.nextInt();
		}
		
		System.out.println("The main Array is :" + Arrays.toString(array));
		
		
		
		for(int j =0 ; j<array.length;j++) {
		
			for(int i = j+1;i<array.length;i++) {
				if(array[j] > array[i]) {
					cons = array[j];
					array[j]= array[i];
					array[i]=cons;
				}
			}
			//System.out.println(array[j]);
		}
		
		System.out.println(Arrays.toString(array));
	}
}
