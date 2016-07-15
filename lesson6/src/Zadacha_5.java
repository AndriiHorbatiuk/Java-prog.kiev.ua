import java.util.Scanner;

/**
 * Created by Andrey on 02.07.2016.
 */
public class Zadacha_5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число в бинароном виде: ");
        String s = scanner.nextLine();
        int b = Integer.parseInt(s,2);
        System.out.println(b);
    }
}
