package packages;

public class nestedFoorLoops {

	public static void main(String[] args) { 
		
		
		for(int i=0; i <= 5 ; i++ ) {
		
			for(int j=1; j <=i ; j++ ) {
				
                  System.out.print(i);
				
			}
		
			System.out.println("---");
	}
		
		System.out.println("---");
		
		for(int i=1; i<= 5 ; i++ ) {
			
			for(int j=i; j<=5 ; j++ ) {
				
                  System.out.print(i);
				
			}
		
			System.out.println("---");
	}
		System.out.println("---");
		
for(int i=1; i<=20 ; i++ ) {
			
			
		if(i%2 == 0) {
			System.out.println("prime:"+ i);
	}
		
}
	
}}




