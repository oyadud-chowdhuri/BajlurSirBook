package ArrayChapter;

public class BasicArrayDeclareAndLengthCheck {
	public static void main(String[] args) {
		
		int [] price = new int [5];
		int [] number = {80,87,82,83,84,85,86};
		
		price [0] = 100;
		price [1] = 250;
		price [2] = 360;
		price [3] = 280;
		price [4] = 130;
		
		System.out.println("length of price = "+ price.length);
		System.out.println("length of number = "+ number.length);
		System.out.println("second value of price is "+ price[1]);
		System.out.println("second value of number is "+ number[1]);
		
		System.out.println();
		System.out.println();
		
		
		int [] myArray = {-45, 1,8,4,5,4,5,105};
		
		System.out.println("index\t\tvalue");
		
		for(int i = 0 ;i<myArray.length;i++) {
			System.out.println(i+"\t\t"+myArray[i]);
		}
		
	}
}
