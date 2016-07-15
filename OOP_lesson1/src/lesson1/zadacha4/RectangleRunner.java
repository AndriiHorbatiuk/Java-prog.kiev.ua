package lesson1.zadacha4;

/**
 * Created by Andrey on 16.07.2016.
 */
public class RectangleRunner {
    public static void main(String[] args) {
        Rectangle rectangle1 = new Rectangle(2,3);
        Rectangle rectangle2 = new Rectangle(4,2);
        Rectangle rectangle3 = new Rectangle(1,23);
        Rectangle rectangle4 = new Rectangle(1,2);
        Rectangle rectangle5 = new Rectangle(3,5);
        int sumArea = rectangle1.getArea()+rectangle2.getArea()+rectangle3.getArea()+rectangle4.getArea()+rectangle5.getArea();
        System.out.println(sumArea);
    }
}
