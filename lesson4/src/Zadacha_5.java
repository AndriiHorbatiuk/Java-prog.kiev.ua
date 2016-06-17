import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by Andrey on 17.06.2016.
 */
public class Zadacha_5 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int[][] pole = new int[3][3];
        boolean win = false;
        int sum1 = 0;
        int sum2 = 0;
        Zadacha_5_player p1 = new Zadacha_5_player();
        while(win == false && sum1 != 3){
            sum1 = 0;
            int x = p1.getNumperX();
            int y = p1.getNumperY();
            pole[x][y] = 1;
            for(int i = 0; i < pole.length; i++){
                for (int count = 0; count < pole[i].length; count++){
                    sum1 += pole[i][count];
                   //if(sum1==3){
                   //     win = true;
                   // }
                }
            }
            int z = 0;
            if(sum1 != 3) {
                for (int i = 0; i < pole.length; i++) {
                    for (int count = 0; count < pole[i].length; z++) {
                        sum2 += pole[i][count];
                        count = (z == 3) ? 3 : 0;
                        //if (sum2 == 3) {
                        //    win = true;
                        //}
                    }
                }
            }
            if(sum1==3){
                win = true;
            }
            if (sum2 == 3) {
                win = true;
            }
        String b = Arrays.toString(pole[0]);
        String c = Arrays.toString(pole[1]);
        String d = Arrays.toString(pole[2]);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
            System.out.println(sum1);
        }
        if(sum1 == 3){
            System.out.println("Выиграл Игрок 1!");
        }
}
}
