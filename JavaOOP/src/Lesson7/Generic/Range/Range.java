package Lesson7.Generic.Range;

/**
 * Created by Andrey on 15.08.2016.
 */
public final class Range<T extends Number>{
    private final T num1;
    private final T num2;

    public Range(T num1, T num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    public T getNum1() {
        return num1;
    }

    public T getNum2() {
        return num2;
    }
}
