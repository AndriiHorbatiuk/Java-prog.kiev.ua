package Visa.utils;

/**
 * Created by Andrey on 17.08.2016.
 */
public class ObjectUtils {
    public static <T> boolean isNotNull(T object){
        boolean result = (object != null)?true:false;
        return result;
    }
}
