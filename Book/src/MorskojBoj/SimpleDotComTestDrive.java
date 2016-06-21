package MorskojBoj;

/**
 * Created by Andrey on 20.06.2016.
 */
public class SimpleDotComTestDrive {
    public static void main(String[] args) {

    SimpleDotCom dot = new SimpleDotCom();
    int[] massiv = {2,3,4};
    String testResult = "Не пройден";
    dot.setLocationCells(massiv);
    String userGuess = "3";
    String result = dot.checkYourself(userGuess);
    if(result.equals("Попал")){
        testResult = "Пройден";
    }
    System.out.println(testResult);
}}
