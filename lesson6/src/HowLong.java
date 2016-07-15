/**
 * Created by Andrey on 29.06.2016.
 */
public class HowLong {
    public static void main(String[] args) {
        long start = System.currentTimeMillis();
//Code
        for(int i = 0; i<100000; i++){
i+=100;
            System.out.println(i);
        }
        long res = System.currentTimeMillis() - start;
        System.out.println("--");
        System.out.println(res);
    }
}
