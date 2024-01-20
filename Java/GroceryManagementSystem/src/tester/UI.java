package tester;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.core.Admin;
import com.core.Grocery;

import groceryManagementExceptionHandling.GroceryManagementException;
import static adminValidation.adminValidation.*;

import java.util.Scanner;
public class UI {

	public static void main(String[] args) {
		Map<String,Grocery>groceryList=new HashMap<>();
		
		try(Scanner sc=new Scanner(System.in)){
		
		System.out.println("Enter username and password");
		loginValidate(sc.next(),sc.next());
		
		boolean flag=true;
		
		while(flag) {
			try {
				System.out.println("Select option\n1.Add new grocery item\n2.Update quantity of item\n3.Display groceries\n4.Remove empty stocks\n5.Dispay recent updates\n0.Exit");
				switch (sc.nextInt()) {
				case 1:
					System.out.println("Enter Grocery name , Price per unit, Stocks");
					Grocery g=new Grocery(sc.next(), sc.nextDouble(), sc.nextInt());
					groceryList.put(g.getName(), g);
					System.out.println("Grocery added successfully...");
					break;
				case 2:
					String name=sc.next();
					groceryCheck(name, groceryList);
					System.out.println("Enter amount of stock for given grocery");
					groceryList.get(name).setStock(sc.nextInt());
					System.out.println("Stock updated successfully...");
					break;
				case 3:
					List<Grocery>groceryDisplay=new ArrayList<Grocery>(groceryList.values());
					for(Grocery gToDisplay:groceryDisplay) {
						System.out.println(gToDisplay);
					}
					break;
				case 4:
						//need to use iterator
					List <String>groceryKeys=new ArrayList<String>(groceryList.keySet());
					for(String gToDisplay:groceryKeys) {
						if(groceryList.get(gToDisplay).getStock()==0) {
							groceryList.remove(gToDisplay);
						}
					}
					System.out.println("Empty stocks removed...");
					break;
					
				case 5:
					groceryKeys=new ArrayList<>(groceryList.keySet());
					for(String gToDisplay:groceryKeys) {
						if(countDays(groceryList.get(gToDisplay))>3) {
							groceryList.remove(gToDisplay);
						}
					}
					break;
					
					
				case 0:
					flag=false;	
					break;
				
				}
			}
			catch (Exception e) {
				System.out.println(e);
				sc.nextLine();
			}
			
			
		}
				
		}
		catch(Exception e) {
			
			System.out.println(e);
			System.out.println("Try again...");
		}
		
		
			
		}
		
		}
		

	


