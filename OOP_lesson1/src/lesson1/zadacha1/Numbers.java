package lesson1.zadacha1;

import java.util.Scanner;

/**
 * Created by Andrey on 15.07.2016.
 */
public class Numbers {
    private String palindrom = null;

    public Numbers() {
        String n = getNumbers();
        String[] array = convertNumbersToArray(n);
        palindromCheck(array);
    }

    private String getNumbers() {
        String numbers;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите числа через запятую: ");
        numbers = scanner.nextLine();
        return numbers;
    }

    private String[] convertNumbersToArray(String n) {
        String[] numbersArrayString = n.split(",");
        return numbersArrayString;
    }

    private String reverseString(String s) {
        String result = "";
        for (int i = s.length() - 1; i >= 0; --i) {
            result += s.charAt(i);
        }
        return result;
    }

    public void palindromCheck(String[] x) {
        int palindromCount = 0;
        for (int i = 0; i < x.length; i++) {
            if (palindromCount < 2) {
                if (x[i].equals(reverseString(x[i]))) {
                    this.palindrom = x[i];
                    palindromCount++;
                }
            }
        }
    }

    public String getPalindrom() {
        return palindrom;
    }
}
