package com.object;

public class BiCycleDemo {
	public static void main(String[] args) {
		Bicycle bike1 = new Bicycle();
		Bicycle bike2 = new Bicycle();
		
		bike1.changeCadence(50);
		bike1.changeGear(3);
		bike1.speedUp(15);
		bike1.printStats();
		
		bike2.changeCadence(50);
		bike2.changeGear(3);
		bike2.speedUp(15);
		bike2.printStats();
		bike2.changeCadence(40);
		bike2.changeGear(2);
		bike2.applyBreaks(5);
		bike2.printStats();
	
	}
}
