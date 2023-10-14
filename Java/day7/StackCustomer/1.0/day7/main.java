package day7;

public class main {
	
	public static void main(String[]args) {
	Stack s=new Stack(3);
	Customer c1=new Customer(1,"Pgs","Pune");
	Customer c2=new Customer(2,"ttt","VC");
	Customer c3=new Customer(3,"vvv","Thane");
	
	s.push(c1);
	s.push(c2);
	s.push(c3);
	s.push(c1);
	
	Customer a=s.pop();
	Customer b=s.pop();
	Customer c=s.pop();
	
	a.getCustomer();
    b.getCustomer();
	c.getCustomer();
	
	Customer d=s.pop();
	//d.getCustomer();
	}
	

}
