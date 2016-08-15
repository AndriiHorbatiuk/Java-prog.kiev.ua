package UrlParser;

import java.net.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.regex.Pattern;

/**
 * Created by Andrey on 13.08.2016.
 */
public class Parser {
    public static void main(String[] args) throws Exception {
        URL url = new URL("http://domain.com:8080/page?param1=param1data&param2=param2data");
        HashMap<String, String> hm = new HashMap<>();
        String[] arrayOfParamsPairs; //Массив с парами вида параметр=значение
        String[] arrayOfParamsAndValues; // Массив с 0-м элементом - параметр, 1-м элементом - значение

        arrayOfParamsPairs = url.getQuery().split("&"); //Получаем параметры и разбиваем на пары

//        Проверяем пары параметр=значение на соответствие паттерну, если не соответствует паттерну - выход из приложения
        String pattern = "[a-z0-9]+=[a-z0-9]+";
        Pattern p = Pattern.compile(pattern);
        for (String s : arrayOfParamsPairs) {
            boolean found = p.matcher(s).matches();
            if (!found) {
                System.out.println("Url Error");
                System.exit(0);
            }
        }

        System.out.println(url.getQuery());

        for (String s : arrayOfParamsPairs) {
            arrayOfParamsAndValues = s.split("="); // Разбиваем пары на ключ и значение
            hm.put(arrayOfParamsAndValues[0], arrayOfParamsAndValues[1]); // Записываем в хешмеп
        }
        System.out.println(hm.get("param1"));
        System.out.println(hm.get("param2"));


    }
}
