package Visa.utils;

/**
 * Created by Andrey on 25.08.2016.
 */
public class ExceptionUtils {

    //String exceptions

    public static void checkStringOnNull(String s) throws NullPointerException {
        if (!StringUtils.isNotNull(s)) {
            throw new NullPointerException("The value of string parameter is null. Change it!");
        }

    }

    public static void checkStringOnEmpty(String s) throws IllegalArgumentException {
        if (!StringUtils.isNotEmpty(s)) {
            throw new IllegalArgumentException("Your string parameter is empty. The value is ''");
        }
    }

    public static void checkStringIsEmail(String s) throws IllegalArgumentException{
        if(!StringUtils.isEmail(s)){
            throw new IllegalArgumentException("Your string is not an email!");
        }
    }

    //Object exceptions

    public static <T> void checkObjectOnNull (T object){
        if (!ObjectUtils.isNotNull(object)){
            throw new NullPointerException("The link on object is null");
        }
    }
}
