package Zadacha3;

/**
 * Created by Andrey on 20.07.2016.
 */
public class Dog extends Animal {
    public void bark() {
        System.out.printf("Собака делает Гав-гав");
    }

    public void jump() {
        System.out.println("Собака Прыгает...");

    }

    public void run() {
        System.out.println("Собака Бегает...");
    }

    public void bite() {
        System.out.println("Собака делает Клац-клац...");
    }
}
