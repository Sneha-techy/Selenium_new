package practise.contact.test;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class JavaBasics {
public static void main(String[] args) {
	Date dateobj=new Date();
	SimpleDateFormat sim=new SimpleDateFormat("yyyy-MM-dd");
	String actDate = sim.format(dateobj);
	System.out.println("Actual Date:"+actDate);
	
	Calendar cal = sim.getCalendar();
    cal.add(Calendar.DAY_OF_MONTH,30);
    String dateRequries = sim.format(cal.getTime());
    
	System.out.println("Before Date:"+dateRequries );
}
}
