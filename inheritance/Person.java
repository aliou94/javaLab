package inheritance;

public class Person {

	String pname;
	int page;
	char pgender;

	// init an empty constructor each time we have a param constructor
	
	

	public Person() {

	}

	public Person(String pname, int page, char pgender) {
		this.pname = pname;
		this.page = page;
		this.pgender = pgender;
	}

	void display() {
		System.out.println("Name: " + this.pname);
		System.out.println("Gender: " + this.pgender);
		System.out.println("Age: " + this.page);
	}
	

}
