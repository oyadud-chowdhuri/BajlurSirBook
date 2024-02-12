package com.object;

enum Day{Saturday,Sunday,Monday,Thuesday,Wednesday,Thursday,Friday};

public class EnumExample {
	public void displayDay(Day day) {
		if(day ==Day.Friday) {
			System.out.println("It's Friday! Weekend!");
		}else if(day == Day.Saturday) {
			System.out.println("It's Saturday! Weekend!");
		}else {
			System.out.println("it's weekday!");
		}
		
	}
	
	public void displayDayWithSwitchCase(Day day) {
		switch (day) {
		case Friday: 
			System.out.println("It's Friday! Weekend!");
			break;
		case Saturday:
			System.out.println("It's Saturday! Weekend!");
			break;
		default:
			System.out.println("it's weekday!");
			break;
		}
	}
	
	public static void main(String[] args) {
		EnumExample enumExample = new EnumExample();
		
		Day day = Day.Friday;
		enumExample.displayDay(day);
		enumExample.displayDayWithSwitchCase(day);
		
		Day[] values = Day.values();
		for (Day day2 : values) {
			System.out.println(day2);
		}
			
		
	}
}
