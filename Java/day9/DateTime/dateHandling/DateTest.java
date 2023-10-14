package dateHandling;
import java.util.*;

public class DateTest {

	public static void main(String[] args) {
		Date d1=new Date();
		System.out.println(d1);
		Date d2=new Date(0);
		System.out.println(d2);
		Date d3=new Date(3600001);//Displays time elapsed after 1 Jan 1970 5:30:00 in millisec
		System.out.println(d3);
		System.out.println(d1.getTime());//millisec elapsed til current date
		System.out.println(d1.after(d2));//return 1 if d1 comes after d2
		System.out.println(d1.before(d2));//return 1 if d1 comes before d2
		System.out.println(d1.equals(d2));//return 1 if d1 and d2 are same
		System.out.println(d1.compareTo(d2));

	}

}
