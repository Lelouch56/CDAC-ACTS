package superkey;

public class Person {
	protected String name;
	protected String lname;
	

	public Person(String name,String lname) {
		this.name=name;
		this.lname=lname;
	}
	
	public void getDetails() {
		System.out.println("name : "+name+" "+lname);
	}
	
	public void setDetails(String name,String lname) {
		this.name=name;
		this.lname=lname;
		
	}
}
