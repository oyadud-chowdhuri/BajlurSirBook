package com.object;

public class Flight {
	private static final int  TOTAL_SEATING_CAPACITY = 150;
	private int totalCheckedBags;
	private int totalPassengers;
	
	public void  addOnePassengers(int bags, int carryOns) {
		int totalBags = bags;
		
		if(carryOns > 2) {
			totalBags = bags + carryOns - 2; 
		}
		addOnePassengers(totalBags);
		
	}
	
	public void  addOnePassengers(int bags) {
		if(isSeatAvailable()) {
			addOnePassengers(); 
			totalCheckedBags += bags;
		}
			
	}
	
	private boolean isSeatAvailable() {
		return totalCheckedBags < TOTAL_SEATING_CAPACITY;
	}
	
	public void addOnePassengers() {
		if(isSeatAvailable()) {
			totalPassengers += 1;
			
		}
	}
	
	public int getTotalCheckedBags() {
		return totalCheckedBags;
	}
	
	public int getTotalPassengers() {
		return totalPassengers;
	}

}
