import java.util.Scanner;

/**
 * Created by Andrey on 09.06.2016.
 */
public class SravnenieDannyh {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Vvedite stroku 1: ");
        String s1 = scanner.nextLine();
        System.out.print("Vvedite stroku 2: ");
        String s2 = scanner.nextLine();
        System.out.println(s1.equals(s2));
        String s3 = "ABC";
        String s4 = "A" + "BC";
        System.out.println(s3.equals(s4));
        System.out.print(s3 == s4);
    }
}
