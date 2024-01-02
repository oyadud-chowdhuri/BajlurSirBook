package BajlurSirBookPractice;

public class TenPerLine {
	public static void main(String[] args) {
		int start = 0; 
		int end = 500;
		
		int perLine = 10;
		
		int counter = start;
		
		while(counter <= end ) {
			
			System.out.print(counter + " ");
			
			if((counter+1)%perLine == 0) {
				System.out.println();
			}
			
			counter++;
		}
	}
}
