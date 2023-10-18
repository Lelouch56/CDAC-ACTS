package customerChecking;
import java.util.List;

import customer.*;

import exceptionHandling.CustomerAlreadyExist;
import exceptionHandling.CustomerExceptionHandle;

public class CustomerValdation {
	
//	public static boolean isCustomer(String username,List<Customer> arr) throws CustomerAlreadyExist{
//		Customer temp=new Customer(username);
//		if(arr.contains(temp)) {
//			
//		}
//		
//		}
//	
	public static int getIndex(String username,String password, List<Customer> arr) throws CustomerAlreadyExist{
		Customer temp=new Customer(username);
		int index=arr.indexOf(temp);
		if (index==-1) {
			throw new CustomerAlreadyExist("Email entered doesn't exist...");
		}
		if(arr.get(index).getPassword().equals(password)) {
			return index;
		}
		throw new CustomerAlreadyExist("Password entered is wrong...");
		
		
		
	}


}






