package ArrayChapter;


import java.util.Arrays;
import java.util.Random;
//import java.util.Scanner;

public class TemperatureOfAllCitiesOfBangladesh {
	public static void main(String[] args) {
		//Scanner input = new Scanner(System.in);
		Random rand = new Random();
		int max=29,min=21;
		int [][] temp = new int[64][365];
		
		
		
		for(int i =0;i<temp.length;i++) {
			for(int j=0;j<temp[i].length;j++) {
				temp[i][j]=(int)rand.nextInt(max - min + 1) + min; 
			}
		}
		
		for (int[] row : temp) {
			System.out.println(Arrays.toString(row));
			
		}
		int maxtemp = temp[0][0];
		int mintemp = temp[0][0];
		int sum=0;
		double avg;
		
		for(int i =0;i<temp.length;i++) {
			for(int j=1;j<temp[i].length;j++) {
				if(mintemp>temp[i][j]) {
					mintemp =temp[i][j];
				} 
				if(maxtemp<temp[i][j]) {
					maxtemp =temp[i][j];
				} 			
				sum += temp[i][j];	
			}
		}
		avg = sum/(64*365);
		
		
		
		System.out.println("Maximum temperature is :" + maxtemp);
		System.out.println("Minimum temperature is :" + mintemp);
		System.out.println("Average  temperature is :" + avg);
		
		
		
		
	}
}
