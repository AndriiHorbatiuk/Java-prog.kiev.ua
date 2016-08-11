package Visa;

import java.util.List;

/**
 * Created by Andrey on 11.08.2016.
 */
public class Request {
    private Countries requestCountry;
    private int numberOfPersonsInRequest;
    private long startTripDate;
    private long lastTripDate;
    private String userEmailInRequest;
    private long requestId;
    private List<Prices> prices;

    private void sendRequestToTravelAgencies(){
//        Метод отправляет запрос агентствам
    }

    private void setRequestPrice(){
//        Агентства устанавливают свою цену по конкретному запросу
    }

    private void viewRequest(){
//        Пользователь просматривает список ответов на запрос
    }

    private void applyRequestl(){
//        Пользователь принимает одно из предложений, что открывает контакты агентства пользователю.
    }

}
