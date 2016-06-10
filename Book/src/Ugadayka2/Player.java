package Ugadayka2;

import java.util.Scanner;

/**
 * Created by Andrey on 10.06.2016.
 */
public class Player {
   int number = 0;
    Scanner scanner = new Scanner(System.in);
    void polzovatelUgadyvaet(){
        System.out.print("Введите число от 0 до 5: ");
        number = scanner.nextInt();
    }
}
