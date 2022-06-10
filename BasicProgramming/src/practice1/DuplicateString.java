package practice1;

public class DuplicateString {

	public static void main(String[] args) {


		String name []= {"Ram","Shyam" ,"Rohan","Ram","Shyam","Gopal"};
		
		for(int i = 0 ; i< name.length ; i++ ) {
			
			for (int j =i+1; j<name.length;j++) {
				
				if(name[i].equals(name[j])) {
					
					System.out.println(name[i]);
					
				}
				
			}
		}
		

	}

}
