package javaQuestions;

public class StringPallindrome {

	public static void main(String[] args) {
		
		String s = "madam";
		String t = "";
		
		for(int i = s.length()-1; i>=0; i--){
			
			t = t + s.charAt(i);
			//System.out.println(t);
		}
		
		if (t.equals(s)) {
			
			System.out.println("String is pallindrome");
		}
		
		else {
			
			System.out.println("String is not a pallindrome");
		}

	}

}
