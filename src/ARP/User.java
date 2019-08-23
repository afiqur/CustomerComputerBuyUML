package ARP;

public class User {
	
	protected String name;
	protected String loginID;
	protected String password;
	public User(String name, String loginID, String password) {

		this.name = name;
		this.loginID = loginID;
		this.password = password;
	}
	
	public void display() {
		System.out.println("Name: "+name+"\n"+"Login ID: "+loginID+"\n"+"password: "+password);
	}
	

}


