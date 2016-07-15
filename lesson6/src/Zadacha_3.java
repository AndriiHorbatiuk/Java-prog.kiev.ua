/**
 * Created by Andrey on 02.07.2016.
 */
public class Zadacha_3 {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        System.out.println(toString(arr));
    }
    static String toString(int[] arr){
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < arr.length; i++){
            sb.append(arr[i]);
        }
        String s = sb.toString();
        return s;
    }
}
