import java.util.Scanner;
public class Main {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter string1: ");
        String s1 = scanner.nextLine();
        System.out.print("Enter string2: ");
        String s2 = scanner.nextLine();
        System.out.print("Enter string3: ");
        String s3 = scanner.nextLine();
        System.out.println("s1 + s3: " + s1 + s3);
        System.out.println("s3 + s2 + s1: " + s3 + s2 + s1);
        System.out.println("s1 + s2 + s3: " + s1 + s2 + s3);
        //int i = scanner.nextInt();
    }
}