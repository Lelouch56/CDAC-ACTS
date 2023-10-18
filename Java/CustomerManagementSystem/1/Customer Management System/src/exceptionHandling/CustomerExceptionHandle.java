package exceptionHandling;
import java.time.LocalDate;
import java.time.format.DateTimeParseException;
import java.util.List;


import customer.*;

public class CustomerExceptionHandle  {
	public static void duplicateCheck(List <Customer>arr,String email) throws CustomerAlreadyExist{
		Customer c=new Customer(email);
		if(arr.contains(c)) {
			throw new CustomerAlreadyExist("Customer already exist..");
		}	
	}
	public static ServicePlan validatePlan(String s) throws IllegalArgumentException {
		return ServicePlan.valueOf(s.toUpperCase());
	}
	
	public static LocalDate parseDate(String date) throws DateTimeParseException {
		LocalDate d=LocalDate.parse(date);
		return d;
	}
	
	public static Customer validateCustomer(List<Customer>cust,String fName, String lName, String email, String password, double registrationAmount,String dob,String service) throws CustomerAlreadyExist {
		
		duplicateCheck(cust, email);
		ServicePlan plan= validatePlan(service);
		LocalDate date=parseDate(dob);
		return new Customer(fName,lName, email,password,registrationAmount, date,plan);
			
	}
}
