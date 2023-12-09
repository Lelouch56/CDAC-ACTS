package tester;

import java.util.Scanner;

import linkedList.SortedLinkedListImpl;

public class Tester {
	public static void main(String [] args) {
		try(Scanner sc = new Scanner(System.in)){
			
			boolean flag=false;
			SortedLinkedListImpl sortedList=new SortedLinkedListImpl();
			while(flag!=true) {
				System.out.println("1.Add data\n2.Display data\n3.Exit");
				try {
					switch (sc.nextInt()) {
					case 1:
						System.out.println("Enter number to insert : ");
						sortedList.insert(sc.nextInt());
						break;
					case 2:
						System.out.println("Linked list is:");
						sortedList.display();
						break;
					case 3:
						flag=true;
						break;
					default:
						System.out.println("Enter valid option...");
						break;
					}
				}
				catch (Exception e) {
					System.out.println(e.getMessage());
				}
			}
			
			
			
		}
	}
}

