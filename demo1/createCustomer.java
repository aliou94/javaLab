package demo1;

import java.util.ArrayList;
import java.util.Scanner;

public class createCustomer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner myObj = new Scanner(System.in); // Create a Scanner object

		System.out.println("how many customers will you create customer");
		int customerNumber = myObj.nextInt();

		int i = 1;

		ArrayList<customer> myCustomers = new ArrayList<customer>();

		while (i <= customerNumber) {

			System.out.println("Enter a customer name");
			String customerName = myObj.next();

			System.out.println("Enter a customer email");
			String customerEmail = myObj.next();

			System.out.println("Enter a customer adress");
			String customerAdresse = myObj.next();

			System.out.println("Enter a customer invoice");
			int customerInvoice = myObj.nextInt();

			customer c1 = new customer();

			c1.setcustomerInfo(customerName, customerEmail, customerAdresse, customerInvoice);

			myCustomers.add(c1);

//			System.out.println(c1.getId());
//			System.out.println(c1.getName());
//			System.out.println(c1.getEmail());
//			System.out.println(c1.getAddress());
//			System.out.println(c1.getInvoice());
			
			i++;
		}
		
		for(customer cust: myCustomers) {
			System.out.println(cust.getName());
			System.out.println(cust.getEmail());
			System.out.println(cust.getAddress());
		}
		
		System.out.println(myCustomers);
		
		

		myObj.close();
	}

}
