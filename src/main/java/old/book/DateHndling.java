package old.book;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DateHndling {
	public static void main(String[] args) {

		      // create a calendar
		      Date se = new Date();
		      SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
		      String strDate= formatter.format(se);
		      System.out.println(strDate);
		      Calendar cal = Calendar.getInstance();
		      cal.setTime(se);
		      // print current year
		      System.out.println("Current year is :" + cal.get(Calendar.YEAR));

		      System.out.println("Current day is :" + cal.get(Calendar.DATE));
		      System.out.println("Current month is :" + cal.get(Calendar.MONTH));
		      cal.add(Calendar.MONTH, 1);
		      System.out.println("Current month is :" + cal.get(Calendar.MONTH));
		      // set the year to something else
		      cal.set(Calendar.YEAR, 1997);

		      // print the result
		      System.out.println("Altered year is :" + cal.get(Calendar.YEAR));
		 
}
}
