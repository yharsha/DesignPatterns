package factory;

import java.util.Calendar;
import java.util.Locale;
import java.util.TimeZone;

public class FactoryEverydayDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calendar cal = Calendar.getInstance();
		System.out.println(cal);
		
		System.out.println(cal.get(Calendar.DAY_OF_MONTH));
		
		//factory impl by parameters
		Calendar cal1 = Calendar.getInstance(TimeZone.getTimeZone("GMT"), Locale.GERMAN);
		System.out.println(cal1);

	}

}
