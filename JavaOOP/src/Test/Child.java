package Test;

/**
 * Created by Andrey on 12.08.2016.
 */
public class Child extends Parent {
    public Child() {
        System.out.println("Child class started");
    }

    String a = "Child class";

    void test(){
        System.out.println("Child method run");
    }
}
