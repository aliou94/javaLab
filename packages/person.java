package packages;

public class person {

	// Instance variables: these are not similar to your local variables
	// It's not best practice to put default values. 
	String pname;
	int page;
	char pgender;
	
	
	public person() {
		
	}
	
	
	public person(String pname, int page, char pgender) {
		this.pname = pname;
		this.page = page;
		this.pgender = pgender;
		
	}
	

	void display() {
		System.out.println("Name: " + this.pname);
		System.out.println("Gender: " + this.pgender);
		System.out.println("Age: " + this.page);
	}
	
	
	static void info() {
		System.out.println("Information about person class...");
		System.out.println("----------------");
	}
	
	public static void main(String[] args) {
		info();
		
		// Calling constructor
		person p1 = new person();
		
		p1.pname = "John";
		p1.page = 20;
		p1.pgender = 'M';  // note the single quotes

		
		p1.display();
		
		System.out.println("----------------");
		
		person p2 = new person();
		
		p2.pname = "Amy";
		p2.page = 22;
		p2.pgender = 'F';  // note the single quotes
		
		p2.display();
		
		System.out.println("----------------");
		
		// We are using the parametized constructor
		person p3 = new person("Carlos", 33, 'M');
		
		p3.display();
		
	}

}
