package tester;
import java.time.LocalDate;
import java.time.format.DateTimeParseException;

import customer.Customer;
import customer.ServicePlan;
import exceptionHandling.CustomerAlreadyExist;
import exceptionHandling.CustomerExceptionHandle;
import static customerChecking.CustomerValdation.*;

import static exceptionHandling.CustomerExceptionHandle.*;
import customerChecking.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		try(Scanner sc=new Scanner(System.in);){
			List<Customer> cust=new ArrayList<>();
			
			
			
			boolean flag=true;
			while(flag) {
				System.out.println("1. Sign up (customer registration)\r\n" + 
						"2. Sign in (login)\r\n"  + 
						"3. Change password\r\n" + 
						"4. Un subscribe customer\r\n"+"5.Display all customers\n");
				try {
				switch(sc.nextInt()) {
				case 1:
						System.out.println("Enter your detailes :First Name, Last Name, email, password,registrationAmount, date of birth , service");
						Customer c=validateCustomer(cust,sc.next(),sc.next(),sc.next(),sc.next(),sc.nextDouble(),sc.next(),sc.next());
						cust.add(c);					
					break;
				case 2:
					System.out.println("Enter email and password");
					String username=sc.next();
					String password=sc.next();
					int index=getIndex(username, password, cust);
					Customer accessed=cust.get(index);
					accessed.getCustomer();
					
					break;
				case 3:
					System.out.println("Enter email and password to confirm user");
					username=sc.next();
					password=sc.next();
					index=getIndex(username, password, cust);
					System.out.println("Verification successful..");
					System.out.println("Enter new password : ");
					cust.get(index).setPassword(sc.next());
					
					break;
				case 4:
					System.out.println("Enter email and password to confirm user");
					username=sc.next();
					password=sc.next();
					index=getIndex(username, password, cust);
					cust.remove(index);
					System.out.println("Customer removed :(");
					break;
				case 5:
					for(Customer c1:cust) {
						c1.getCustomer();
					}
					break;
				}
				}
				catch(CustomerAlreadyExist e) {
					System.out.println(e);
				}
				catch(DateTimeParseException d) {
					System.out.println(d);
				}
				catch(IllegalArgumentException i) {
					System.out.println(i);
				}
				catch(Exception e) {
					System.out.println("wt happened");
					sc.next();
				}
			
			
			}}
			
	

	}

}
