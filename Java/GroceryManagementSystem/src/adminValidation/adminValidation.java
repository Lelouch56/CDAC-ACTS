package adminValidation;

import java.util.Map;

import com.core.Admin;
import com.core.Grocery;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

import groceryManagementExceptionHandling.GroceryManagementException;

public class adminValidation {
		public static void loginValidate(String user,String password) throws GroceryManagementException{
			if(user.equals(Admin.username)&&password.equals(Admin.password)) {
				System.out.println("Logged in successfully...");
			}
			else{throw new GroceryManagementException("Invalid credentials...");
			}
			}
		
		public static void groceryCheck(String name,Map<String,Grocery>list) throws GroceryManagementException {
			if(!list.containsKey(name)) {
				throw new GroceryManagementException("Provided grocery name is not in stock..");
			}			
		}
		
		public static int countDays(Grocery g) {
			return (int)ChronoUnit.DAYS.between(g.getLastUpdated(),LocalDateTime.now());
		}
}
