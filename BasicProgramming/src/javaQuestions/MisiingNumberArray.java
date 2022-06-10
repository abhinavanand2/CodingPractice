package javaQuestions;

public class MisiingNumberArray {

	public static void main(String[] args) {
		
		int a [] = {1,2,4,5};
		int sum = 0;
		
		for (int i=0;i<a.length;i++) {
			
			sum = sum+ a[i];
			
		}
		
		System.out.println(sum);
		
		int sum1 = 0;
		int b []= {1,2,3,4,5};
		
		for (int j = 0 ; j<5; j++ ) {
			
			sum1 = sum1 + b[j];
			
		}
		
		System.out.println(sum1);
		System.out.println("Missing number is " + (sum1-sum));
	}

		
}
