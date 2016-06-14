import java.util.Arrays;
import java.util.Scanner;
import java.util.Arrays;

/**
 * Created by Andrey on 13.06.2016.
 */
public class Zadacha_5_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите количество элементов в массиве: ");
        int n = scanner.nextInt();
        int[] massiv = new int[n];
        int m = 0;
        while (m < n) {
            System.out.print("Введите значение: ");
            massiv[m] = scanner.nextInt();
            ++m;
        }
        String s = Arrays.toString(massiv);
        System.out.println("Массив: " + s);
        System.out.print("Какой элемент из массива вывести? ");
        int num_massiv = scanner.nextInt();
        System.out.println("Вы выбрали для вывода элемент " + num_massiv +", которому соответствует значение: " + massiv[num_massiv]);
    }
}
