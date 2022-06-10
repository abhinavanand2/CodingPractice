package javaQuestions;

import java.util.Scanner;

public class EnterNumber {
	
	//Java program to print an integer entered by user

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter a number");
		
		int num = sc.nextInt();
		System.out.println("You entered " + num);

	}

}
