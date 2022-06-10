package javaQuestions;

import java.util.Arrays;

public class SmallestAndLargestNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int number [] = {10,20,11,2345 ,24};
		
		int largest = number[0];
		int smallest = number[0];
		
		for (int i = 1; i<number.length;i++) {
			
			if (largest>number[i]) {
				
			largest = number[i];
			
			} 
			
			else if (smallest<number[i]) {
				
				smallest = number[i];
				
				
			}
		}
		
		System.out.println("Given array is " + Arrays.toString(number));
		System.out.println("Largest number is " +  largest);
		System.out.println("Smallest number is " +  smallest);
		
		

	}

}
