	package practice1;
	
	
	//Print 1 to 100 without using any numeric values
	public class PrintOneToHundredwoNumeric {
	
		public static void main(String[] args) {
			
			int one= 'A'/'A'; //A/A=1
			String s = "..........";
			for(int i = one; i<= (s.length() * s.length()) ; i++) {
				
				System.out.println(i);
			}
			
			//a=97 , b=98 , c=99 , d=100
			for(int i = one; i<='d';i++) {
				
				System.out.println(i);
			}
	
		}
	
	}
