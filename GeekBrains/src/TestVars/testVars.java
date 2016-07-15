package TestVars;

/**
 * Created by Andrey on 13.07.2016.
 */
public class testVars {
    public static void main(String[] args) {
        Class1 class1 = new Class1();
        Class1.count += 1;
        Class1 class2 = new Class1();
        Class1.count += 1;
        Class1 class3 = new Class1();
        Class1.count += 1;
        Class1 class4 = new Class1();
        Class1.count += 1;
        System.out.println(Class1.count);
        Class12 class12 = new Class12();
        Class12 class13 = new Class12();
        Class12 class14 = new Class12();
        Class12 class15 = new Class12();

        Class1[] array = {class12, class13};
        System.out.println(array.length);

    }
}
