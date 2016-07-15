import java.util.Arrays;

public class StringMethods {
    public static void main(String[] args) {

        //charAt(int index)
        String s = "StringChar", s2 = "CharString", s3 = "StringChar", name = "John", age = "23";
        System.out.println("0 element of string is: " + s.charAt(0));

        //codePointAt
        System.out.println("The character (Unicode code point) at the specified index: " + s.codePointAt(0));

        //codePointBefore

        System.out.println("The character (Unicode code point) at the before index: " + s.codePointBefore(1));

        //codePointCount(int beginIndex, int endIndex)
        System.out.println("The number of Unicode code points in the specified text range(0 - 5) of this String: " + s.codePointCount(0,5));

        //compareTo

        System.out.println("s equals s2? " + s.compareTo(s2));

        //compareToIgnoreCase

        System.out.println("s equals s2? " + s.compareToIgnoreCase(s2));

        //concat
        System.out.println("Concatinate s and s2: " + s.concat(s2));

        //contains
        System.out.println("Contains s: " + s.contains(s2));

        //contentEquals
        System.out.println("Content equals? " + s.contentEquals(s3));

        //copyValueOf

        char[] arrString = {'h', 'e', 'l', 'l', 'o', ' ', 'w', 'o', 'r', 'l', 'd'};
        System.out.println(s3.copyValueOf(arrString,2,6));

        //endsWith
        System.out.println("Ends with ar? " + s.endsWith("ar"));

        //equalsIgnoreCase

        System.out.println("Does s equals stringchar? " + s.equalsIgnoreCase("stringchar"));

        //format

        System.out.println("What is his name and age? " + String.format("His age is %s and his name is %s", age, name));

        //getBytes

        byte[] bytearr = age.getBytes();
        System.out.println(bytearr);

        //getChars
        char[] chararr = new char[5];
        s.getChars(0,3,chararr,0);
        String viewarr = Arrays.toString(chararr);
        System.out.println("String to char array: " + viewarr);

        //hashCode

        int hash = s.hashCode();
        System.out.println("Hashcode of s = " + hash);

        //indexOf character

        int index = s.indexOf("a",2);
        System.out.println("Index of a = " + index);

        //index of SubString

        index = s.indexOf("Char");
        System.out.println("Index of Char = " + index);

        //intern
        System.out.println("Canonical of s = " + s.intern());

        //isEmpty
        String empty = "";
        System.out.println("Is 'empty' empty? " + empty.isEmpty());

        //join
        String message = String.join("-",s,s2,s3);
        System.out.println(message);

        //lastIndexOf
        System.out.println("Last index of r = " + s.lastIndexOf("r"));

        //length
        System.out.println("Length of s string: " + s.length());

        //matches
        System.out.println("Matches regex .*ar$ : " + s.matches("(.*ar$)"));


    }

}
