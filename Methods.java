package Methods;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Methods {
	public static void main(String[] args) {
		//Finiding date
		Date date = new Date();
		
		SimpleDateFormat datef = new SimpleDateFormat("dd/MM/YYYY");
		String c =datef.format(date);
		System.out.println(c);
		
	}
}
