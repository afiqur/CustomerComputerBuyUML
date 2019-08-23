package ARP;

public class Laptop extends ElectronicGadget implements DisplayService {

	private String model;
	private String price;
	private String powerpack;

	public Laptop(String manufacturer, String model, String price, String powerpack) {
		super(manufacturer);
		this.model = model;
		this.price = price;
		this.powerpack = powerpack;
	}

	public void display() {
		super.display();
		System.out.println("Model: " + model + "\n" + "Price: " + price + "\n" + "Powerpack: " + powerpack);
	}

	public void onService() {
		System.out.println("Service is ON");

	}

	public void offService() {
		System.out.println("Service is OFF");

	}

}

