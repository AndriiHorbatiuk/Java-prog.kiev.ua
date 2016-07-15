import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by Andrey on 02.07.2016.
 */
public class Zadacha_6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число: ");
        int userNumber = scanner.nextInt();
        String binaryNumber = Integer.toBinaryString(userNumber);
        System.out.println(binaryNumber);
        int[] array = convertToArray(binaryNumber);
        int result = countOfArray(array);
        System.out.println(result);
    }

    static int[] convertToArray(String x) {
        int[] arr = new int[x.length()];
        for (int i = 0; i < x.length(); i++) {
            arr[i] = x.charAt(i) - '0';
        }
        return arr;
    }

    static int countOfArray(int[] x) {
        int count = 0;
        for (int i = 0; i < x.length; i++) {
            if (x[i] == 1) {
                count += 1;
            }
        }
        return count;
    }
}
