package javaQuestions;

public class LargestAmongThreeNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int x = 800;
		int y = 1500;
		int z = 3000;
		
		if (x>y && x>z) {
			
			System.out.println("X is the largest number");
		}
		
		else if (y>z) {
			
			System.out.println("Y is the largest number");
		}

		else {
			
			System.out.println("Z is the largest number");
		}
	}

}
