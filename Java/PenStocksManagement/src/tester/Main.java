package tester;
import com.core.*;

import java.time.LocalDate;
import java.util.*;
import static penValidation.PenValidation.*;
import static utils.monthsChecking.*;


public class Main {

	public static void main(String[] args) {
		try(Scanner sc=new Scanner(System.in)){
			
			List<Pen> penList=new ArrayList<>();
			
			boolean flag=true;
			Pen p1=null;
			
			while(flag) {
				System.out.println("Select Option:\n1.Add new Pen\n2.Update stock of a Pen\n3.Set discount(Not sold in 3 months\n4.Remove Pens(Not sold in 9 months)");
				try {
				switch(sc.nextInt()) {
				case 1:
					System.out.println("Enter details Brand Color Material Quantity DateOfListing");
					p1=validateAllInputs(sc.next(), sc.next(), sc.next(), sc.nextInt(),sc.next(), penList);
					penList.add(p1);
					System.out.println("Pen added...");
										
					break;
				case 2:
					Iterator<Pen>itr=penList.iterator();
					while(itr.hasNext()) {
						p1=itr.next();
						p1.currentPen();
						System.out.println("Modify the stock (-ve if want to remove)");
						p1.updateStock(sc.nextInt());
						p1.currentPen();
						
					}
					System.out.println("Stock upadated...");
					break;
				case 3:
					
					for(Pen p:penList) {
						p.getPrice();
						if(toMonths(LocalDate.now(), p.getLastUpdatedDate())<=-3) {
							p.setDiscount(20);
						}
						
						p.getPrice();
					}
					break;
				case 4:
					Iterator<Pen>itr1=penList.iterator();
					while(itr1.hasNext()) {
						p1=itr1.next();
						if(toMonths(LocalDate.now(), p1.getLastUpdatedDate())<=-9) {
							itr1.remove();
						}
					}
					System.out.println("Stock removed..");
					break;
				case 0:
					flag=false;
					break;
				}
				}
				catch(Exception e) {
					System.out.println(e);
					sc.nextLine();				}
				for(Pen p:penList) {
					System.out.println(p);
				}
				
			}
			}
			
		}

		

	}


