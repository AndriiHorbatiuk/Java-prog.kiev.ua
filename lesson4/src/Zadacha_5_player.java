import java.util.Scanner;

/**
 * Created by Andrey on 17.06.2016.
 */
public class Zadacha_5_player {
    private int number = 0;
    Scanner s = new Scanner(System.in);
    public int getNumperX(){

        System.out.print("Ходит Игрок. Куда поставить крестик, ось Х? (0,1,2): ");
        int x = s.nextInt();
        return x;
    }

    public int getNumperY(){
        System.out.print("Ходит Игрок. Куда поставить крестик, ось У? (0,1,2): ");
        int y = s.nextInt();
        return y;
    }
}
