package practice1;

public class AlphabeticPattern1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		A
//		B B
//		C C C
//		D D D D
//		E E E E E
//		F F F F F F

		
		int a = 65;
		
		for (int i=0;i<=5;i++) {
			
			for (int j=0;j<=i;j++) {
				
				System.out.print((char) a+" ");
			}
			
				a++;
				System.out.println();
		}
		
		
	}

}
