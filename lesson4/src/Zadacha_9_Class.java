/**
 * Created by Andrey on 17.06.2016.
 */
public class Zadacha_9_Class{
    public int[] mirror(int[] s){
       // int[] arr = new int[s.length];
        //for(int i = 0, j = ((s.length)-1); i < s.length; i++, j--){
        //    arr[j] = s[i];
        //}
        //return arr;
        int m = 0;
        for(int i = 0, j = ((s.length)-1); i < s.length/2; i++, j--){
            m = s[i];
            s[i] = s[j];
            s[j] = m;
        }
        return s;
    }
}
