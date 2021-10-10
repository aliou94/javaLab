package inheritance;

import java.util.Scanner;

//import inheritance.Adresse.Address;

public class Employee extends Person {

	private static final char[] pgender = null;
	int empID;
	double empSalary;
	double empBonus;
	
	// adress here refrences to the adresse class created in the same package
	Adresse empAddress;

	public Employee() {

	}

	Employee(String name, int age, char gender, double empBonus, double empSalary, int empID) {

		super(name, age, gender);
		this.empID = empID;
		this.empSalary = empSalary;
		this.empBonus = empBonus;
	}
	
	

	public void createAddress() {

		empAddress = new Adresse();
		empAddress.street = "123 easy street";
		empAddress.city = "New York";
		empAddress.state = "NY";
		empAddress.zipcode = 11226;

	}

	public double calculate() {
		double newSal = empSalary + empBonus;
		return newSal;

	}

	public void display() {
		createAddress();
		System.out.println(empAddress.street);
		System.out.println(empAddress.city);
		System.out.println(empAddress.state);
		System.out.println(empAddress.zipcode);
		
	}



}
