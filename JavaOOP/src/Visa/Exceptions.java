package Visa;

import java.util.HashMap;

/**
 * Created by Andrey on 15.08.2016.
 */
public class Exceptions {
    public static void nullHashmapChecker(HashMap hashMap){
        try{
            if(hashMap == null){
                throw new NullPointerException();
            }
        }catch (NullPointerException e)
        {
            e.printStackTrace();
        }
    }
}
