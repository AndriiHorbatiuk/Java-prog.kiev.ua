package GetterSetter;

/**
 * Created by Andrey on 15.06.2016.
 */
public class Secondary {
    private int num1 = 1;
    private int num2;

    public int getNum1(){
        return num1;
    }
    public int getNum2(){
        return num2;
    }

    public void setNum1(int s1){
        if(s1 < 0){
            System.out.println("Less than zero");
        } else{
         num1 = s1;
        }
    }
    public void setNum2(int s2){
        num2 = s2;
    }
}
