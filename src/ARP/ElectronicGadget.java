package ARP;

public class ElectronicGadget {
	protected String manufacturer;

	public ElectronicGadget(String manufacturer) {
		this.manufacturer = manufacturer;
	}

	public void display() {
		System.out.println("Manufacturer: " + manufacturer);
	}

}

