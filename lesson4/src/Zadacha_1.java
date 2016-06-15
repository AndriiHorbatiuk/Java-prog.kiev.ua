/**
 * Created by Andrey on 15.06.2016.
 */
public class Zadacha_1 {
    public static void main(String[] args) {
        System.out.println("for output: ");
        //for
        for (int i = 10; i <= 20; i++) {
            System.out.println(i);
        }
        //while
        System.out.println("while output: ");
        int i = 10;
        while (i <= 20) {
            System.out.println(i);
            i++;
        }
        //do while
        System.out.println("do while output: ");
        i = 10;
        do {
            System.out.println(i);
            i++;
        }
        while (i <= 20);
        //for each
        System.out.println("for each output: ");
        int[] massiv = {10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20};
        for (int x : massiv) {
            System.out.println(x);
        }
    }
}
