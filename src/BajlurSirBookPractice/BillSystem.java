package BajlurSirBookPractice;

import java.util.Scanner;

public class BillSystem {
	public static void main(String[] args) {
		System.out.println("How many product did you buy ?");
		
		Scanner input = new Scanner(System.in);
		int numberOfProduct = input.nextInt();
		
		double p1,p2,p3,p4,p5,p6;
		
		double total;
		double amount = 0;
		
		if(numberOfProduct==1) {
			System.out.println("Enter the Price");
			p1 = input.nextDouble();
			total = p1;
		}else if (numberOfProduct==2) {
			System.out.println("Enter the Price one by one");
			p1 = input.nextDouble();
			p2 = input.nextDouble();
			total = p1+p2;
		}else if (numberOfProduct==3) {
			System.out.println("Enter the Price one by one");
			p1 = input.nextDouble();
			p2 = input.nextDouble();
			p3 = input.nextDouble();
			total =  p1+p2+p3;
		}else if (numberOfProduct==4) {
			System.out.println("Enter the Price one by one");
			p1 = input.nextDouble();
			p2 = input.nextDouble();
			p3 = input.nextDouble();
			p4 = input.nextDouble();
			total =  p1+p2+p3+p4;
		}else if (numberOfProduct==5) {
			System.out.println("Enter the Price one by one");
			p1 = input.nextDouble();
			p2 = input.nextDouble();
			p3 = input.nextDouble();
			p4 = input.nextDouble();
			p5 = input.nextDouble();
			total =  p1+p2+p3+p4+p5;
		}else {
			System.out.println("Enter the Price one by one");
			p1 = input.nextDouble();
			p2 = input.nextDouble();
			p3 = input.nextDouble();
			p4 = input.nextDouble();
			p5 = input.nextDouble();
			p6 = input.nextDouble();
			total =  p1+p2+p3+p4+p5+p6;
		}
		double totalPrice = total + (total*0.15);
		
		System.out.println("Total Price : "+totalPrice);
		System.out.println("Please pay the money..");
		int givenMoney;
		
		
		do {
			
			
			
			givenMoney = input.nextInt();
			
			if(totalPrice >givenMoney) {
				amount = totalPrice - givenMoney;
				
				System.out.println("You have to pay more "+ amount);
				
				totalPrice = amount;
			}else if(totalPrice < givenMoney) {
				amount  = givenMoney - amount;
				
				System.out.println("Bill Paid");
				System.out.println("Here is your Changes: "+ amount );
				
				break;
			}else if(totalPrice == givenMoney) {
				System.out.println("Bill Paid");
			}
			
		}while(givenMoney != totalPrice );
		
	}
}
