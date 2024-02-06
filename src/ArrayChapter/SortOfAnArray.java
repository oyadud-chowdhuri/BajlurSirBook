package ArrayChapter;

import java.util.Arrays;

public class SortOfAnArray {
	public static void main(String[] args) {
		int [] array = {4,8,3,7,23,942,5,47,35,11};
		
		
		int cons;
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
