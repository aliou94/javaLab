package exceptionHandeler;

public class PracticeErrorHandeling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
		
		String name = "ahmed";
		
		int age = 30;
		
		// handeling errors for cars array erreor
		
 try{  
	 
	 System.out.println(cars[4]);
	   
	   }
 catch(Exception e){
	 
	 System.out.println("exception handled");}  
	

	// handeling errors for name array
	 try{  
		 

	
		 System.out.println(Integer.parseInt(name));
		   
		   }
	 catch(Exception e){
		 
		 System.out.println("exception handled for name");}  
		
	

	// handeling errors for age

	try

	{

		System.out.println(age/0);

	}catch(
	Exception e)
	{

		System.out.println("exception handled for age");
	}

}

}
