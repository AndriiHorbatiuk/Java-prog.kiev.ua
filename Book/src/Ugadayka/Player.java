package Ugadayka;

/**
 * Created by Andrey on 10.06.2016.
 */
public class Player {
    int number = 0;
    public void guess(){
        number = (int)(Math.random()*10);
        System.out.println("Думаю ,что это число: " + number);
    }
}
