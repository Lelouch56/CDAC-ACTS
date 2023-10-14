package dateHandling;
import java.util.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;

public class DateTime {
	private static SimpleDateFormat sdf;
	static {
		sdf=new SimpleDateFormat("dd*MM*yyyy");
	}
	

	public static void main(String[] args) {
		
		
		try(Scanner sc=new Scanner(System.in);){
		Date tom=sdf.parse(sc.next());
		Date kal=sdf.parse(sc.next());
		System.out.println(tom.after(kal));
		System.out.println(kal.after(tom));
		System.out.println(tom.equals(kal));
		}
		catch(ParseException e) {
			System.out.println(e);
		}
		
		
	
	}
}
