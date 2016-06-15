/**
 * Created by Andrey on 15.06.2016.
 */
public class Zadacha_0 {
    public static void main(String[] args) {
        int[] x = new int[28];
        for (int i = 0; i < x.length; i++) {
            x[i] = i * 635;
            switch (i){
                case 0:{
                    System.out.println(x[i]);
                    break;
                }
                case 14:{
                    System.out.println(x[i]);
                    break;
                }
                case 27:{
                    System.out.println(x[i]);
                    break;
                }
                default:{
                    System.out.print("");
                }
            }
        }
        //System.out.println("0, 14, 27: " + x[0] + " " + x[14]+ " " + x[27]);
    }
}
