package day7;
import java.util.Scanner;

public class main {
	
	public static void main(String[]args) {
		Scanner sc= new Scanner(System.in);
		
		
		StackI s = null;
		boolean flag=false;
		while(flag==false){
			System.out.println("Enter 1 for Stack \n2 for growable stack\n3 to add customer details\n4 to pop customer\n5to exit ");
			switch(sc.nextInt()) {
		case 1:
			if(s==null) {
			 s=new Stack(4);
			}else {
				System.out.println("Stack alredy initialized");
			}
			 break;
			
		case 2:if(s==null) {
			 s =new StackGrowable(4);
		}
		else {
			System.out.println("Stack alredy initialized");
		}
			 break;
		case 3:
			try{
				if(s instanceof Stack) {
				s=(Stack)s;
				System.out.println("Enter customers details: ");
				s.push(new Customer(sc.nextInt(),sc.next(),sc.next()));
			}
			else {
				s=(StackGrowable)s;
				System.out.println("Enter customers details: ");
				s.push(new Customer(sc.nextInt(),sc.next(),sc.next()));
				
			}}
			catch(Exception e) {
				
			}
			break;
		
		case 4:
			try{
				if(s instanceof Stack) {
			
				s=(Stack)s;
				System.out.println("Customers details: ");
				s.pop().getCustomer();;
			}
			else {
				s=(StackGrowable)s;
				System.out.println("Customers details: ");
				s.pop().getCustomer();;
				
			}
		}
		catch(Exception e) {
			
		}
			break;
			
		case 5:
			flag=true;
		}
	}
		
		
//	StackGrowable s=new StackGrowable(3);
//	Customer c1=new Customer(1,"Pgs","Pune");
//	Customer c2=new Customer(2,"ttt","VC");
//	Customer c3=new Customer(3,"vvv","Thane");
//	Customer c4=new Customer(4,"vvv","Thane");
//	
//	s.push(c1);
//	s.push(c2);
//	s.push(c3);
//	s.push(c4);
//	s.push(c1);
//	
//	Customer a=s.pop();
//	Customer b=s.pop();
//	Customer c=s.pop();
//	Customer e=s.pop();
//	a.getCustomer();
//    b.getCustomer();
//	c.getCustomer();
//	e.getCustomer();
//	Customer d=s.pop();
//	d.getCustomer();
		sc.close();
	}
	

	
}

