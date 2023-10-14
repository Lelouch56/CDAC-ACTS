package day7;

public class Customer {
	private int id;
	private String name;
	private String address;
	
	
	public Customer(int a, String b, String c) {
		System.out.println("Customer ceated..");
		id=a;
		name=b;
		address=c;
	}
	public void getCustomer() {
		System.out.println(id+" "+name+" "+address);		
	}
	
}
