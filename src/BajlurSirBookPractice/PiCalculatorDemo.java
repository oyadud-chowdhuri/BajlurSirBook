package BajlurSirBookPractice;

public class PiCalculatorDemo {
	public static void main(String[] args) {
		PiCalculator piCalculator = new PiCalculator();
		var pi = piCalculator.calculator(100000);
		
		System.out.println("pi =" + pi);
	}
}
