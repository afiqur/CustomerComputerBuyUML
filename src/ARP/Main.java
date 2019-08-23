package ARP;

public class Main {

	public static void main(String[] args) {

		Customer c = new Customer("Tamkin", "181-15-10609", "12345", "tamkin@gmail.com", "01787720093");
		Laptop l = new Laptop("Acer", "A515-51G-59UX", "51500.00", "20 Days");
		BuyLaptop bl = new BuyLaptop(c, l, "16th April 2019", 2);
		bl.display();
		bl.laptop.onService();
		bl.laptop.offService();

	}

}


