package Ugadayka;

/**
 * Created by Andrey on 10.06.2016.
 */
public class GuessGame {
    Player p1;
    Player p2;
    Player p3;

    public void startGame(){
        p1 = new Player();
        p2 = new Player();
        p3 = new Player();
        int guessp1 = 0;
        int guessp2 = 0;
        int guessp3 = 0;
        boolean p1isright = false;
        boolean p2isright = false;
        boolean p3isright = false;

        int targetNumber = (int)(Math.random()*10);
        System.out.println("Я загадываю число от 0 до 9...");
        while(p1isright == false & p2isright == false & p3isright == false){
            System.out.println("Число, которое нужно угадать - " + targetNumber);
            p1.guess();
            p2.guess();
            p3.guess();
            guessp1 = p1.number;
            System.out.println("Первый игрок думает, что это будет число " + guessp1);
            guessp1 = p2.number;
            System.out.println("Второй игрок думает, что это будет число " + guessp2);
            guessp1 = p3.number;
            System.out.println("Третий игрок думает, что это будет число " + guessp3);
            if (guessp1 == targetNumber){
                p1isright = true;
            }
            if (guessp2 == targetNumber){
                p2isright = true;
            }
            if (guessp3 == targetNumber){
                p3isright = true;
            }
            if (p1isright || p2isright || p3isright){
                System.out.println("У нас есть победитель!");
                System.out.println("Первый игрок угадал? " + p1isright);
                System.out.println("Второй игрок угадал? " + p2isright);
                System.out.println("Третий игрок угадал? " + p3isright);
                System.out.println("Конец игры.");
            } else{
                System.out.println("Игроки должны попробоват ьеще раз.");
            }
        }
    }
}
