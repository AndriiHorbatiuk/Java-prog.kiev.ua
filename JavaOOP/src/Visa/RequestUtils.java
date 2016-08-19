package Visa;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

/**
 * Created by Andrey on 15.08.2016.
 */
public class RequestUtils {
    void sendRequestToTravelAgencies() {
//        Метод отправляет запрос агентствам
    }

    void sendRequestLinkToUser() {
        //Метод отправляет пользователю на почту ссылку на страницу запроса
    }

    void setRequestPrice() {
//        Агентства устанавливают свою цену по конкретному запросу
    }

    void viewRequest() {
//        Пользователь просматривает список ответов на запрос
    }

    void applyRequestl() {
//        Пользователь принимает одно из предложений, что открывает контакты агентства пользователю.
    }

   static void convertMillisecondsToDate(Long milliSeconds){
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(milliSeconds);
        DateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
        System.out.println(formatter.format(calendar.getTime()));
    }
}
