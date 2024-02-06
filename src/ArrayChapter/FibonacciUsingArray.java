package ArrayChapter;

import java.util.Arrays;

public class FibonacciUsingArray {
	public static void main(String[] args) {
		long [] array = new long [56];
		array [0]=0;
		array [1]=1;
		
		for(int i =2; i<array.length;i++) {
			array[i]= array[i-2]+array[i-1];
		}
		System.out.println(Arrays.toString(array));
	}
}
