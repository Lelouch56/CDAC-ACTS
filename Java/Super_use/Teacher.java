package superkey;

public class Teacher extends Person {
	protected String sub;
	protected int std;

	public Teacher(String name,String lname, String sub, int std){
		super(name,lname);
		this.sub=sub;
		this.std=std;
	}
	
	public void getDetails() {
		super.getDetails();
		System.out.println("std : "+std+" "+"sub : "+sub);
	}

	public void setDetails(String name,String lname, String sub, int std) {
		super.setDetails(name, lname);
		this.sub=sub;
		this.std=std;
	}
}
