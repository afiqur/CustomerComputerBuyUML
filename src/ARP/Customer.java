package ARP;

public class Customer extends User {

	private String email;
	private String cellNO;

	public Customer(String name, String loginID, String password, String email, String cellNO) {
		super(name, loginID, password);
		this.email = email;
		this.cellNO = cellNO;
	}

	public void display() {
		super.display();
		System.out.println("Email: " + email + "\n" + "Cell NO: " + cellNO);
	}

}

