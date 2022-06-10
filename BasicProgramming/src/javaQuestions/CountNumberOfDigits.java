package javaQuestions;

public class CountNumberOfDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		int num = 1234;
//		int count = 0;
		int numRev= 3456;
		int rev = 0;
		
		/*
		 * while(num!=0) {
		 * 
		 * num = num/10; //123 ++count;
		 * 
		 * 
		 * }
		 */
		
		//System.out.print(count);
		
		while (numRev!=0) {
			 
			int n = numRev%10;
			rev = rev *10 +n;
			numRev = numRev/10;
			
			}
		
		System.out.print(rev);

	}

}
