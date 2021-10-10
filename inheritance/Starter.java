package inheritance;

import java.util.Scanner;

public class Starter {

	public static void main(String[] args) {
		// Making Student Objects
//		int id, String name, int age, char gender, double s1, double s2, double s3

		Scanner myObj = new Scanner(System.in);

		System.out.println("Enter student id");
		int stdId = myObj.nextInt();
//
		System.out.println("Enter student name");
		String stdName = myObj.next();
//
		System.out.println("Enter student age");
		int stdage = myObj.nextInt();
//
		System.out.println("Enter student gender");
		char stdgender = myObj.next().charAt(0);
//
		System.out.println("Enter student score for subject1");
		double stdSubject1 = myObj.nextDouble();
//
		System.out.println("Enter student score for subject2");
		double stdSubject2 = myObj.nextDouble();
//
		System.out.println("Enter student score for subject3");
		double stdSubject3 = myObj.nextDouble();
//
		Student student1 = new Student(stdId, stdName, stdage, stdgender, stdSubject1, stdSubject2, stdSubject3);

	
		
		
		// This display method is being called from our Student class
		student1.display();
		
		
		
		

	
		System.out.println("Enter employee name");
		String empName = myObj.next();
		
		System.out.println("Enter employee age");
		int empage = myObj.nextInt();
		
		System.out.println("Enter employee gender");
		char empgender = myObj.next().charAt(0);
		
		System.out.println("Enter employee bonus");
		double empBonus = myObj.nextDouble();

		System.out.println("Enter employee salary ");
		double empSalary = myObj.nextDouble();
		
		System.out.println("Enter employee id");
		int empId = myObj.nextInt();

		
		
		Employee e1 = new Employee(empName , empage, empgender, empBonus, empSalary , empId);
		System.out.println(e1.pname);
		System.out.println(e1.page);
//		System.out.println(e1.pgender);
		e1.display();
		e1.empSalary = 1000000.00;
		e1.empBonus = 100.00;
		System.out.println(e1.calculate());

		

	}

}
