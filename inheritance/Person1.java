package inheritance;

import java.util.Scanner;

interface Income {

	public static final String organizationName = "perScholas";

	public double calculate(int hourlpay); // interface method (does not have a body)

	public int saving(int rate1, int baseRate); // interface method (does not have a body)
}

public class Person1 implements Income {

	private String name;
	private String nationality;
	private String maritalStatus;
	private char gender;

	@Override
	public int saving(int rate, int hourlyPay) {
		// TODO Auto-generated method stub
		
//		System.out.println(hourlyPay * 40);
		
		int income = hourlyPay * 40;
		;
		double  saving = income * rate;
		
		System.out.println(saving);
		
		return (int)saving ;
	}

	@Override
	public double calculate(int hourlpay) {
		// TODO Auto-generated method stub

		return hourlpay * 40.0;
	}

	public String getName(String name2) {
		return name;
	}

	public String getNationality(String nat) {
		return nationality;
	}

	public String getMaritalStatus(String matStatus) {
		return maritalStatus;
	}

	public char getGender(char gender2) {
		return gender;
	}

	public void setPersonInfo(String nationality, String name, String maritalStatus) {

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
//
//		System.out.println("Enter person gender");
//		char gender = myObj.next().charAt(0);

		System.out.println("Enter person matrimonial status");
		String matStatus = myObj.next();

		System.out.println("Enter person nationality");
		String nat = myObj.next();
//		
		System.out.println("Enter person hourlyPay");
		int pay = myObj.nextInt();
//		
		System.out.println("Enter person savign rate");
		int rate = myObj.nextInt();

		Person1 AHMED = new Person1();

		AHMED.setPersonInfo(nat, name, matStatus);

		System.out.println(AHMED.getName(name));
		System.out.println(AHMED.getNationality(nat));
		System.out.println(AHMED.getMaritalStatus(matStatus));
//		System.out.print(AHMED.getGender(gender));
		
	
		System.out.println(AHMED.saving(rate, pay));
		System.out.println(AHMED.calculate(pay));
//

	
	}

}
