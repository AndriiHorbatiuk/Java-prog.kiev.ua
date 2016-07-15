package lesson1.zadacha4;

/**
 * Created by Andrey on 16.07.2016.
 */
public class Rectangle {
    private int area;

    public Rectangle(int a, int b) {
        areaOfRectangle(a, b);
    }

    private int getPerimetr(int a, int b) {
        int perimetr = (2 * a) + (2 * b);
        return perimetr;
    }

    private void areaOfRectangle(int a, int b) {
        this.area = a * b;
    }

    public int getArea() {
        return area;
    }
}
