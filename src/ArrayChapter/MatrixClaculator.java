package ArrayChapter;

import java.util.Arrays;
import java.util.Scanner;

public class MatrixClaculator {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int [][] matrix1 = new int [3][3];
		int [][] matrix2 = new int [3][3];
		
		System.out.println("Enter Matrix 1");
		for(int row=0; row<matrix1.length;row++) {
			for(int column =0; column<matrix1[row].length;column++) {
				System.out.printf("[%d][%d]",row,column);
				matrix1[row][column]= input.nextInt();
				
			}
		}
		
		
		System.out.println("Enter Matrix 2");
		for(int row=0; row<matrix2.length;row++) {
			for(int column =0; column<matrix2[row].length;column++) {
				System.out.printf("[%d][%d]",row,column);
				matrix2[row][column]= input.nextInt();
				
			}
		}
		
		int [][]sum = new int[3][3];
		for(int row=0; row<sum.length;row++) {
			for(int column =0; column<sum[row].length;column++) {
				
				sum[row][column]= matrix1[row][column]+matrix2[row][column];
				
			}
		}
		
		int [][]subtraction = new int[3][3];
		for(int row=0; row<subtraction.length;row++) {
			for(int column =0; column<subtraction[row].length;column++) {
				
				subtraction[row][column]= matrix1[row][column]- matrix2[row][column];
				
			}
		}
		
		int [][]product = new int[3][3];
		for(int row=0; row<product.length;row++) {
			for(int column =0; column<product[row].length;column++) {
				
				product[row][column]= matrix1[row][column]* matrix2[row][column];
				
			}
		}
		System.out.println("Sum :");
		for (int[] row : sum) {
			System.out.println(Arrays.toString(row));
		}
		
		System.out.println("Subtraction :");
		for (int[] row : subtraction) {
			System.out.println(Arrays.toString(row));
		}
		
		System.out.println("Product :");
		for (int[] row : product) {
			System.out.println(Arrays.toString(row));
		}
		
		
	}
}
