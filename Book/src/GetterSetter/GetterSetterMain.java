package GetterSetter;

/**
 * Created by Andrey on 15.06.2016.
 */
public class GetterSetterMain {
    int n1 = -10;
    int n2 = 12;
    public void Run(){
        Secondary num = new Secondary();
        num.setNum1(n1);
        num.setNum2(n2);
        System.out.println(num.getNum1());
        System.out.println(num.getNum2());
    }
}
