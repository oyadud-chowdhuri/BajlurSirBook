package ArrayChapter;

public class EnhancedForLoopExample {
	public static void main(String[] args) {
		int [] numbers = {1,5,7,5,4,-5,4,-6,5,4};
		int sum = 0;
		
		for(int number : numbers) {
			sum += number;
		}
		
		System.out.println("Sum = "+ sum);
	}
}
