import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/**
 * Created by Andrey on 01.07.2016.
 */
public class Zadacha_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите дату: ");
        String s = scanner.nextLine();
        Date dt1 = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
        String result = sdf.format(dt1);
        System.out.println(s.compareTo(result));
    }
}
