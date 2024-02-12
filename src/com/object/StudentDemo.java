package com.object;

public class StudentDemo {
	public static void main(String[] args) {
		Student inaiya = new Student("INaiYA", new double[] {95.75,97.75,100});
		
		double TotalMarks = inaiya.totalMarks();
		double Avg = inaiya.average();
		
		System.out.println("Total Marks = "+ TotalMarks);
		System.out.println("Average Marks = "+ Avg);
	}
}
