package javaLearning;

public class FirstClass {

	public static void main(String args[]) {
	
int x = 55;
		
if( x >= 90) {
			
	System.out.println('A');
		
} 
else if (x >= 80 && x < 90) {
	
		System.out.println('B');
		
}
else if (x >= 70 && x < 80) {
	
	System.out.println('C');
	
}
else if (x >= 60 && x < 70) {
	
	System.out.println('D');
} 
else if (x >= 55 && x < 60) {
	
		System.out.println('E');
		
			
} else {
	System.out.println('F');
	
}
		
		
		
	int day = 2;
	
	switch(day) {
	  case 1:
			System.out.println("Monday");
	    break;
	  case 2:
		  System.out.println("Tuesday");
	    break;
	  case 3:
		  System.out.println("Wednesday");
		    break;
	  case 4:
		  System.out.println("Thursday");
		    break;
	  case 5:
		  System.out.println("Friday");
		    break;
	  case 6:
		  System.out.println("Satuday");
		    break;
	  case 7:
		  System.out.println("Sunday");
		    break;
	  default:
		  System.out.println("invalid input");
	}
	
	
	
	int num = 18;
	
	if( num % 2 != 0) {
				
		System.out.println("Cool");
			
	} else if (num % 2 == 0 && num >= 2 && num <= 5) {
		
		System.out.println("Not Cool");
		
	}else if (num % 2 == 0 && num >= 6 && num <= 20) {
		
		System.out.println("Cool");
		
	}else if (num % 2 == 0 && num > 20) {
		
		System.out.println("Not Cool");
	}
	
	
	
		
		
}}
