package Lesson7.Generic.Range;

import java.util.Comparator;
import java.util.Objects;

/**
 * Created by Andrey on 16.08.2016.
 */
public class Runner {
    public static void main(String[] args) {
        Range range = new Range(20.22,19);
        int result = Objects.compare(range.getNum1(),range.getNum2(), new RangeUtils());
        if(result < 0){
            System.out.println("Промежуток указан верно. Числа: " + range.getNum1() + ", " + range.getNum2());
        } else if(result == 0){
            System.out.println("Это не промежуток. Числа равны. Числа: " + range.getNum1() + ", " + range.getNum2());
        }
            else {
            System.out.println("Промежуток указан НЕверно. Числа: " + range.getNum1() + ", " + range.getNum2());
        }

    }


}
