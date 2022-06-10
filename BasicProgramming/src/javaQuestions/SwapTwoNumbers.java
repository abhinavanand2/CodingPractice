package javaQuestions;

public class SwapTwoNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a = 3;
		int b = 2;
		
		/*
		 * System.out.println("Before Swapping"); System.out.println("a = " + a);
		 * System.out.println("b = " + b);
		 * 
		 * System.out.println("After Swapping");
		 * 
		 * int temp; temp = a; a=b; b=temp;
		 * 
		 * System.out.println("a = " + a); System.out.println("b = " + b);
		 */
		
		//Without temp
		System.out.println("Before Swapping"); 
		System.out.println("a = " + a);
		System.out.println("b = " + b);
		System.out.println("After Swapping");
		
		a = a-b ; 
		b = a+b;
		a = b-a;
		System.out.println("a = " + a);
		System.out.println("b = " + b);
		
		
		
		
		

	}

}
