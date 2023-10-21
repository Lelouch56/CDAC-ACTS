package utils;

import java.time.LocalDate;
import java.time.Period;

public class monthsChecking {
	public static int toMonths(LocalDate currentDate,LocalDate lastSold) {
		
		int d= (int)(Period.between(currentDate, lastSold).toTotalMonths());
		//System.out.println(d);
		return d;
	}

}
