package ArrayChapter;

import java.util.Arrays;

public class ArrayStack {
	public static void main(String[] args) {
		int [] array = {1,2,3,4,5,6};
		
		int n = array.length;
		int value = 8;
		int [] newArray = new int [n+1];
		
		for(int i=0; i<n;i++) {
			newArray[i] = array[i];
		}
		newArray[n]= value;
		
		System.out.println(Arrays.toString(newArray));
	}
}
