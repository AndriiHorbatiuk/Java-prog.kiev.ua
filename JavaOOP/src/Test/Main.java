package Test;

/**
 * Created by Andrey on 12.08.2016.
 */
public class Main {
    public static void main(String[] args) {
        Parent child = new Child();
//        child.test();
        use(child);
    }

    static void use(Parent parent){
        System.out.println("use parent link");
        parent.test();
    }

    static void use(Child child){
        System.out.println("use parent link");
        child.test();
    }


}
