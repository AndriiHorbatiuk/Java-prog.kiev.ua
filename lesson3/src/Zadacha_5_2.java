import java.util.Arrays;
import java.util.Scanner;
import java.util.Arrays;

/**
 * Created by Andrey on 13.06.2016.
 */
public class Zadacha_5_2 {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите количество элементов в массиве: ");
        int n = scanner.nextInt();
        int[] massiv = new int[n];
        while (n>0){
            System.out.print("Введите значение: ");
            massiv[n-1] = scanner.nextInt();
            --n;
        }
        String s = Arrays.toString(massiv);
        System.out.print(s);
    }
}
