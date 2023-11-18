package tester;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import dao.UserData;
import pojos.User;

public class Tester {
	
	public static void main(String[] args) {
		List<User>userList=new ArrayList<User>();
		try(Scanner sc=new Scanner(System.in)){
			UserData ud=new UserData();
			System.out.println("Enter Role, Begin Date, End Date");
			userList=ud.getSelectedData(sc.next(),Date.valueOf(sc.next()),Date.valueOf(sc.next()));
			userList.forEach(u->System.out.println(u));
		}
		catch(Exception e) {
			System.out.println(e);
		}

	}
	

}
