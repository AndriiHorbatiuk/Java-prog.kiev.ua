import java.rmi.activation.ActivationSystem;
import java.util.Arrays;

/**
 * Created by Andrey on 22.06.2016.
 */
public class ProgDebugger {
    public static void main(String[] args) {
        int[] x = new int[14];
        for (int i = 0; i < x.length; i++) {
            if ((i * 444) % 17 > 0)
                x[i] = i;
            else
                x[i] = -1;
        }
        String s = Arrays.toString(x);
        System.out.println(s);
    }
}
