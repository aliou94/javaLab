package packages;

public class Student {
	
	int studentId;
	String firstName;
	String lastName;
	String email;
	double subject1;
	double subject2;
	double subject3;
	
	
	// Static can be called without object references
	
	void displayInfo(){
		
		System.out.println("studentId: " + this.studentId);
		System.out.println("FirstName: " + this.firstName);
		System.out.println("LastName: " + this.lastName);
		System.out.println("email: " + this.email);
		System.out.println("subject1: " + this.subject1);
		System.out.println("subject2: " + this.subject2);
		System.out.println("subject3: " + this.subject3);
		
		
	}
	
	
	void average(){
		
         double result = this.subject1 +  this.subject2 + this.subject3;
         
         double average = (result/3);
 	
		System.out.println(average);
		
	}
	
	public Student (int studentId, String firstName, String lastName, String email, double subject1, double subject2,double subject3 ) {
		
		this.studentId = studentId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.subject1 = subject1;
		this.subject2 = subject2;
		this.subject3 = subject3;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student  s1 = new Student(0001,"fname", "lname", "email@email", 90.5, 80.0, 70.0);
		
		

		s1.displayInfo();
		s1.average();
	}

}
