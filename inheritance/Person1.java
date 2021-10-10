package inheritance;

import java.util.Scanner;

public class Person1 {
	
	
	private String name;
	private String  nationality;
	private String maritalStatus;
	private char gender;
	
	
	
	public String getName() {
		return name;
	}

	

	public String  getNationality() {
		return nationality;
	}
	
	public String  getMaritalStatus() {
		return maritalStatus;
	}
	
	
	public char getGender() {
		return gender;
	}
	
	public void setPersonInfo( String nationality, String name, String maritalStatus, char gender) {
		
		this.nationality = nationality;
		this.gender = gender;
		this.maritalStatus = maritalStatus;
		this.name = name;
	}

	


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner myObj = new Scanner(System.in);
//
		System.out.println("Enter person name");
		String name = myObj.next();

		System.out.println("Enter person gender");
		char gender = myObj.next().charAt(0);
		
		System.out.println("Enter person matrimonial status");
		String matStatus = myObj.next();
		
		System.out.println("Enter person nationality");
		String nat = myObj.next();
		
		 Person1 AHMED = new Person1();
		 
		 AHMED.setPersonInfo(nat, name, matStatus, gender);
		 
		 System.out.println(AHMED.getName());
		 System.out.println(AHMED.getNationality());
		 System.out.println(AHMED.getMaritalStatus());
		 System.out.print(AHMED.getGender());
//
		
	}

}
