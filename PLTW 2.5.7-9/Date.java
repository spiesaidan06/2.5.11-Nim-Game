// Aidan Spies
import java.util.Calendar;

public class Date {

  public static String getDateTime() {
    Calendar cal = Calendar.getInstance();
    String dateTimeStr = cal.getTime().toString();
    return dateTimeStr;
  }
}