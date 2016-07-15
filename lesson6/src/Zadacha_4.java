import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by Andrey on 02.07.2016.
 */
public class Zadacha_4 {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6};
        System.out.print("Какой бит меняем: ");
        Scanner scanner = new Scanner(System.in);
        int changeBitPosition = scanner.nextInt();
        int arrIndex = arrayPosition(changeBitPosition);
        if (arrIndex > 0) {
            changeBitPosition = arrayPositionInItem(arrIndex, changeBitPosition);
        }
        String[] StrArr = convertToBytes(array);
        StrArr[arrIndex] = toBinaryString(setBit(array[arrIndex], changeBitPosition));
        System.out.println(Arrays.toString(StrArr));
//        System.out.println(isBitSet(array[arrIndex],changeBitPosition));
    }

    static int arrayPosition(int x) {
        int y = x / 32;
        return y;
    }

    static int arrayPositionInItem(int y, int x) {
        int z = x - (y * 32);
        return z;
    }

    static int setBit(int x, int pos) {
        return x | (1 << pos);
    }

    static String[] convertToBytes(int[] array) {
        String[] massiv = new String[array.length];
        for (int i = 0; i < array.length; i++) {
            massiv[i] = toBinaryString(array[i]);
        }
        return massiv;
    }

    static String toBinaryString(int x) {
        return String.format("%32s", Integer.toBinaryString(x)).replace(" ", "0");
    }

    static boolean isBitSet(int x, int pos){
        return (x & (1 << pos)) != 0;
    }

}
