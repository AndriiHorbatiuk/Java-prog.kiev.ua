package Ugadayka2;

/**
 * Created by Andrey on 10.06.2016.
 */
public class GuessGame {
    void startGame(){
        int targetNumber = 0;
        boolean winner = false;
        Player p1 = new Player();
        Player p2 = new Player();
        Player p3 = new Player();
        while (winner == false){
            targetNumber = (int)(Math.random()*5);
            p1.polzovatelUgadyvaet();
            p2.polzovatelUgadyvaet();
            p3.polzovatelUgadyvaet();
            System.out.println("Число, которое нужно угадать: " + targetNumber);
            System.out.println("Игрок 1 думает, что это: " + p1.number);
            System.out.println("Игрок 2 думает, что это: " + p2.number);
            System.out.println("Игрок 3 думает, что это: " + p3.number);
            if (p1.number == targetNumber){
                System.out.println("У нас есть победитель! Это 1 игрок.");
                winner = true;
            }
            if (p2.number == targetNumber){
                System.out.println("У нас есть победитель! Это 2 игрок.");
                winner = true;
            }
            if (p3.number == targetNumber){
                System.out.println("У нас есть победитель! Это 3 игрок.");
                winner = true;
            }
            if (p1.number != targetNumber & p2.number != targetNumber & p3.number != targetNumber){
                System.out.println("Нет победителей, пробуем снова.");
            }
        }
    }
}
