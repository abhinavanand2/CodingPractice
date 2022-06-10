package javaQuestions;

public class PimeNumberBetweenNumbers {

	public static void main(String[] args) {
		
		int low = 20;
		int high = 30;
		
		while (low<high) {
			
			boolean flag1 = false;
			
			
			for (int i= 2 ;i<=low/2 ;i++) {
				
				if(low % i == 0) {
					
					flag1 = true;
					break;
				}
			}
			
			if (!flag1) {
				
				System.out.println(low);
				
			}
			
			low ++;
		}
		
		
	}

}
