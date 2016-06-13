import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by Andrey on 13.06.2016.
 */
public class Zadacha3 {
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);
        int[] massiv = new int[10];
        System.out.print("Введите число 1: ");
        massiv[0] = scanner.nextInt();
        System.out.print("Введите число 2: ");
        massiv[1] = scanner.nextInt();
        System.out.print("Введите число 3: ");
        massiv[2] = scanner.nextInt();
        System.out.print("Введите число 4: ");
        massiv[3] = scanner.nextInt();
        System.out.print("Введите число 5: ");
        massiv[4] = scanner.nextInt();
        System.out.print("Введите число 6: ");
        massiv[5] = scanner.nextInt();
        System.out.print("Введите число 7: ");
        massiv[6] = scanner.nextInt();
        System.out.print("Введите число 8: ");
        massiv[7] = scanner.nextInt();
        System.out.print("Введите число 9: ");
        massiv[8] = scanner.nextInt();
        System.out.print("Введите число 10: ");
        massiv[9] = scanner.nextInt();
        int[] massiv1 = new int[massiv.length/2];
        int[] massiv2 = new int[massiv.length/2];
        System.arraycopy(massiv,0,massiv1,0,5);
        System.arraycopy(massiv,5,massiv2,0,5);
        String s1 = Arrays.toString(massiv1);
        String s2 = Arrays.toString(massiv2);
        String s = Arrays.toString(massiv);
        System.out.println(s);
        System.out.println(s1);
        System.out.println(s2);
    }
}
