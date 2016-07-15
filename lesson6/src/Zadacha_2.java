/**
 * Created by Andrey on 02.07.2016.
 */
public class Zadacha_2 {
    static boolean equals(short[] a1, short[] a2){
        if(a1.length != a2.length){
            return false;
        }
        for(int i = 0; i < a1.length; i++){
            if(a1[i] != a2[i]){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        short[] a1 = {1,2,3,4,5};
        short[] a2 = {1,78,3,4,5};
        short[] a3 = {1,8,3,9,5};
        short[] a4 = {1,2,3,4,5};
        System.out.println(equals(a1,a2));
        System.out.println(equals(a2,a3));
        System.out.println(equals(a3,a4));
        System.out.println(equals(a1,a4));
    }
}
