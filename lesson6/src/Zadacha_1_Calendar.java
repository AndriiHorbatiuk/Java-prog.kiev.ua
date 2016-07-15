import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

/**
 * Created by Andrey on 02.07.2016.
 */
public class Zadacha_1_Calendar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Calendar calendar = Calendar.getInstance();
        Calendar calendarCurr = Calendar.getInstance();
        Date currentDate = new Date();
        calendarCurr.setTime(currentDate);
        SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
        System.out.print("Введите дату: ");
        String userDate = scanner.nextLine();
        try {
            Date userDt = sdf.parse(userDate);
            calendar.setTime(userDt);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        if (!calendar.equals(calendarCurr)) {
            int y1 = calendar.get(Calendar.YEAR);
            int y2 = calendarCurr.get(Calendar.YEAR);
            if (y1 != y2) {
                System.out.println("Different years: " + y1 + "-" + y2);
            }
            int m1 = calendar.get(Calendar.MONTH);
            int m2 = calendarCurr.get(Calendar.MONTH);
            if (m1 != m2) {
                System.out.println("Different mothes: " + m1 + "-" + m2);
            }
            int d1 = calendar.get(Calendar.DATE);
            int d2 = calendarCurr.get(Calendar.DATE);
            if (d1 != d2) {
                System.out.println("Different dates: " + d1 + "-" + d2);
            }

        }
    }
}
