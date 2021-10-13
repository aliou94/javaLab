package exceptionHandeling;

public class ExceptionHandling {

	public static void main(String[] args) {

		String str = "This is my string";
		String name = null;
		
		// ========= WE ARE CREATING LOGIC FOR OUR STR VARIABLE ==========

		try {
			// code that may raise exception
			

		} catch (StringIndexOutOfBoundsException ex) {

			// rest code of the program
			System.out.println("Exception occurred: " + ex.getMessage());
			
		} catch (Exception e) {
			System.out.println("Exception occurred: " + e.getMessage());
		}
		
		// ========= WE ARE CREATING LOGIC FOR OUR NAME VARIABLE =========
		
	
		
		try {
			
			System.out.println("The length of the name is: " + name.length());
			
		} catch (NullPointerException npex) {
			
			System.out.println(npex.getMessage());
			
		}
		finally {
			System.out.println("Hello! We will always run!");
		}	
//		
		
		System.out.println("Just finished printing my string! ;) ");
	}
	
}
