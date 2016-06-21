package MorskojBoj;

import java.util.Scanner;


/**
 * Created by Andrey on 21.06.2016.
 */
public class SimpleDotComGame {
    public static void main(String[] args) {
        int shots= 0;
        Scanner scanner = new Scanner(System.in);
        SimpleDotCom dot = new SimpleDotCom();
        String finish = "Мимо";
        int randomNum = (int)(Math.random()*5);
        System.out.println(randomNum);
        int[] location = {randomNum,randomNum+1,randomNum+2};
        dot.setLocationCells(location);
        while(!finish.equals("Потопил")){
            System.out.print("Куда стреляем: ");
            String s = scanner.nextLine();
            finish = dot.checkYourself(s);
            System.out.println(finish);
            ++shots;
            }
        System.out.println("Вам понадобилось выстрелов: " + shots);

    }
}
