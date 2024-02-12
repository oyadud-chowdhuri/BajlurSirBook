package com.object;

public class FlightDemo {
	public static void main(String[] args) {
		Flight flight = new Flight();
		
		flight.addOnePassengers();
		flight.addOnePassengers(2);
		flight.addOnePassengers(2,2);
		
		int totalCheckedBags = flight.getTotalCheckedBags();
		System.out.println("Total Checked Bags = " + totalCheckedBags);
		
		int totalPassengers = flight.getTotalPassengers();
		System.out.println("Total Passengers = " + totalPassengers);
		
	
	
	}
}
