import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;
public class DateFormat {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		java.util.Date date = Calendar.getInstance().getTime();
		System.out.println("date >>>" + date);
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-DD  HH24:mm:SS");
		String formatedDate = sdf.format(date);
		System.out.println("formatted string >>" + formatedDate);
	}

}
