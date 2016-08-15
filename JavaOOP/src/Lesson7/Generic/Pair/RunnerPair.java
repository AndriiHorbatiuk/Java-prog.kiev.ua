package Lesson7.Generic.Pair;

/**
 * Created by Andrey on 15.08.2016.
 */
public class RunnerPair {
    public static void main(String[] args) {
        Pair<Integer, String> pair = new Pair(1,"the first");
        System.out.println("Number " + pair.getLeft() + ", " + "Word " + pair.getRight() );
        System.out.println(pair);
    }

}
