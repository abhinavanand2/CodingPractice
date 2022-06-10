package practice1;

public class PrintNameThousandTimes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String name = "Abhinav";
		String s = "a";
		s = s.replaceAll("a", "aaaaaaaaaa"); //10
		s = s.replaceAll("a", "aaaaaaaaaa");//100
		s = s.replaceAll("a", "aaaaaaaaaa");//100*10=1000
		s= s.replaceAll("a",name + "\n");
		
		System.out.println(s);		

	}


}
 