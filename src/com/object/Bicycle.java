package com.object;

import javax.management.loading.PrivateClassLoader;

public class Bicycle {
	private int cadence= 0;
	private int speed = 0;
	private int gear = 1;
	
	public Bicycle() {
		System.out.println("Bicycle Object created");
	}
	
	public void changeCadence(int newvalue) {
		cadence = newvalue;
	}
	public void changeGear(int newvalue) {
		gear = newvalue;
	} 
	public void speedUp(int increament) {
		speed += increament;
	}
	
	public void applyBreaks(int decrement) {
		speed -= decrement;
	}
	
	public void printStats() {
		System.out.println("Cadence : "+ cadence +" Spped: "+speed+" Gear:"+gear );
	}
	
}
