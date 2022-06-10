	package practice1;
	
	public class ReverseNumber {
	
		public static void main(String[] args) {
			//Normal way
			
	//		int num = 12345;
	//		while (num>0) {
	//			
	//			int rev = num % 10;
	//			System.out.print(rev);
	//			num = num / 10;
			
			rev(14326644);
			rev(1232);
			rev(001);
			}
		
		public static void rev(int num) {
			
			if(num<10) {
				System.out.println(num);
				return;
			}
			
			else {
				
				System.out.print(num % 10);
				rev (num/10);
			}
			
		}
	
		}
	
	
