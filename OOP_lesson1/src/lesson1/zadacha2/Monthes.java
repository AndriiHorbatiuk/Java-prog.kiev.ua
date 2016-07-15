package lesson1.zadacha2;

import java.util.Scanner;

/**
 * Created by Andrey on 16.07.2016.
 */
public class Monthes {

    private String[] monthesArray = {"January", "February", "March", "April", "May", "June", "July", "August",
            "September", "October", "November", "December"};
    private String monthName = "";

    public Monthes() {

        int userNumber = getUserMonthNumber();
        getMonthNameFromUserNumber(userNumber);
    }

    private int getUserMonthNumber() {
        Scanner scanner = new Scanner(System.in);
        int month;
        do {
            System.out.print("Введите номер месяца для отображения: ");
            month = scanner.nextInt();
        } while (month < 1 || month > 12);
        month = month - 1;
        return month;
    }

    public void getMonthNameFromUserNumber(int x) {
        monthName = monthesArray[x];
    }

    public String getMonthName() {
        return monthName;
    }
}
