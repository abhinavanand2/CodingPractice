	package practice1;
	
	public class PrintNumberWithoutLoop {
		
		//Print number 1 to 100 without using loop
		//*1. Recursive
		// 2. Java streams
	
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			 //printnum(1);
			 printNumb(5,500);
			 
			 
	
		}
		
		public static void printnum(int num) {
			
			if(num<=100) {
			System.out.println(num);
			num++;
			printnum(num);
			
		}
			
			
		}
			
			public static void printNumb(int strtNumb,int endNumb) {
				
				if (strtNumb<=endNumb) {
					
					System.out.println(strtNumb);
					strtNumb++;
					printNumb(strtNumb,endNumb);
					
					
				}
			}
			
			
			
			
		}
	
	
