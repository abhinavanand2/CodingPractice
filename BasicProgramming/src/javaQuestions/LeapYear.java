package javaQuestions;

public class LeapYear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Century Year is leap year if divisible by 4
		//Century year is leap year if divisible by 400
		
		int year = 2020;
		boolean leap = false;
		if (year % 4==0) {
			
			if (year%100==0) {
				
				if (year%400 ==0) {
					
					leap = true;
				}
				
				else {
					leap = false;
				}
			}
				
				else {
					leap = true;
				}
		}
				
				else {
					leap = false;
				}
		
			
			if (leap) {
				
				System.out.println( year + " is a leap year");
			}
			
			else {
				
				System.out.println( year + " is not a leap year");
			}
		}

	}


