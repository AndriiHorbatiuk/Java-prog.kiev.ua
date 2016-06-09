import java.util.Scanner;
public class IntegerClass {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Vvedite chislo 1: ");
        int chislo1 = scanner.nextInt();
        System.out.print("Vvedite chislo 2: ");
        int chislo2 = scanner.nextInt();
        System.out.println("Chislo 1: " + chislo1);
        System.out.println("Chislo 2: " + chislo2);
        System.out.print("Summa: ");
        System.out.println(chislo1 + chislo2);
        System.out.print("Delenie: ");
        System.out.println(chislo1 / chislo2);
        System.out.print("Umnojenie: ");
        System.out.println(chislo1 * chislo2);
        System.out.print("Raznica: ");
        System.out.println(chislo1 - chislo2);
        System.out.print("chislo1++: ");
        System.out.println(chislo1++);
        System.out.print("chislo1: ");
        System.out.println(chislo1);
    }
    }