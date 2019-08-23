package ARP;

public class BuyLaptop {

	Customer customer;
	Laptop laptop;
	public String date;
	public int quantity;

	public BuyLaptop(Customer customer, Laptop laptop, String date, int quantity) {
		this.customer = customer;
		this.laptop = laptop;
		this.date = date;
		this.quantity = quantity;
	}

	public void display() {
		customer.display();
		laptop.display();
		System.out.println("Buy Date: " + date + " Quantity: " + quantity);
	}

}


