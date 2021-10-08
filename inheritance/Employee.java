package inheritance;

//import inheritance.Adresse.Address;

public class Employee extends Person {

	int empID;
	double empSalary;
	double empBonus;
	Adresse empAddress;

	public Employee() {

	}

	Employee(String name, int age, char gender, double empBonus, double empSalary, int empID) {

		super(name, age, gender);

		this.empID = empID;
		this.empSalary = empSalary;
		this.empBonus = empBonus;
	}// end Employee
	

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

	public static void main(String[] args) {
		
		Employee e1 = new Employee("Vanessa", 99, 'f', 200.00, 50000.00, 001);
		e1.display();
		e1.empSalary = 1000000.00;
		e1.empBonus = 100.00;
		System.out.println(e1.calculate());

	}

}
