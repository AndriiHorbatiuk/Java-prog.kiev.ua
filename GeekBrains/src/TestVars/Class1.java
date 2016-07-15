package TestVars;

/**
 * Created by Andrey on 13.07.2016.
 */
public class Class1 {
    private int age;
    private int nAme;
    static int count;

    public void setName(int name) {
        this.nAme = name;
    }

    public int getName() {

        return nAme;
    }

    public void setAge(int age) {

        this.age = age;
    }

    public int getAge() {

        return age;
    }
}
