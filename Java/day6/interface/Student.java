package superkey;

public class Student extends Person {
	protected int roll;
	protected float marks;
	public Student(String name,String lname, int roll, float marks){
		super(name,lname);
		this.roll=roll;
		this.marks=marks;
	}
	
	public void getDetails() {
		super.getDetails();
		System.out.println("roll : "+roll+" "+"marks : "+marks);
	}

	public void setDetails(String name,String lname, int roll, float marks) {
		super.setDetails(name, lname);
		this.roll=roll;
		this.marks=marks;
	}
}
