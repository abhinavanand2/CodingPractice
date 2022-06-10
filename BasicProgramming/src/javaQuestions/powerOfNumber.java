package javaQuestions;

public class powerOfNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 3^4 = 81
		int base = 2;
		int exponent = 3;
		
		int result = 1;
		
		while (exponent!= 0) {
			
			result = result * base;
			-- exponent;
			
		}
		
		System.out.println(result);
		System.out.println("*********************************************************************************");
		int base1 = 4;
		int exponent1 = 3;
		
		System.out.println(Math.pow(base1, exponent1));
		
	}

}
