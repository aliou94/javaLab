package demo1;

public class customer {

	// The private keyword is an access modifier used for attributes, methods and
	// constructors,
	// making them only accessible within the declared class.
	private String name;
	private static int id;
	private int invoice;
	private String address;
	private String email;

	public int getId() {
		return ++id;
	}

	public int getInvoice() {
		return invoice;
	}

	public String getName() {
		return name;
	}

	public String getAddress() {
		return address;
	}

	public String getEmail() {
		return email;
	}

	public void setcustomerInfo(String name, String email, String address, int invoice) {
		this.name = name;
		this.address = address;
		this.email = email;
		this.invoice = invoice;

	}

}
