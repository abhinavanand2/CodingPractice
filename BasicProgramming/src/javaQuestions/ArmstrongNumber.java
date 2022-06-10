package javaQuestions;

public class ArmstrongNumber {

	public static void main(String[] args) {
		// 153 = 1*1*1 + 5*5*5 + 3*3*3 = 153
		
		int num = 143;
		
		int actualNumb = num;
		double result = 0;
		
		while(actualNumb !=0) {
			
			int n = actualNumb %10; //3
			result = result + Math.pow(n, 3);
			actualNumb = actualNumb /10;
			
		}
		
		if(result == num) {
			
			System.out.println(num + " is Armstrong");
		}
		else {
			
			System.out.println(num + " is not Armstrong");
		}
		
		

	}

}
