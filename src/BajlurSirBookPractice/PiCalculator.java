package BajlurSirBookPractice;

public class PiCalculator {
	public double calculator (int nTerms) {
		double numerator = 4.0;
		double denumerator = 1.0;
		double sign = 1.0;
		
		double pi = 0.0;
		
		for(int i=0; i < nTerms; i++) {
			pi += sign*(numerator/denumerator);
			denumerator += 2.0;
			
			sign *= -1.0;
		}
		
		return pi;
	}
}
