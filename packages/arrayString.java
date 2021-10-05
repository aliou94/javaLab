package packages;


import java.util.Scanner;

public class arrayString {

	public static void main(String words[]) {
		
		  Scanner myObj = new Scanner(System.in);  // Create a Scanner object
		  
		  System.out.println("Enter a programming language");
		  
		  String proLanguage = myObj.nextLine();
		  
		 
		  int result = 0;
		
		// TODO Auto-generated method stub
		
		int count = 0;
		
		String[] array1 = {
				"java" , "c++", "python", "java", "c++"
		};
		

		for (int i = 0; i<array1.length ; i++) {
			
			
			
		
		  result =  proLanguage.equalsIgnoreCase(array1[i]) ? ++count : count;
		 
		
		
		
	}
		 System.out.println(result);


}
	
	
}
