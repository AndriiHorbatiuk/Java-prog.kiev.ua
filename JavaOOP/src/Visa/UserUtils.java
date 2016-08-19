package Visa;

import Visa.dataStorage.AllUsers;

/**
 * Created by Andrey on 17.08.2016.
 */
public class UserUtils {

//Проверяет: существует ли пользователь в общем списке пользователей

    public static boolean checkUserExistence(String s) {
        return AllUsers.getAllUsersMap().containsKey(s);
    }

    //Создание нового запроса (с проверкой на существование пользователя)
    public static void checkUserNewRequest(String s, Request request) {
        if (checkUserExistence(s)) {
            addRequestToUser(request, AllUsers.getAllUsersMap().get(s));
        } else {
            User newUser = new User(s);
            addRequestToUser(request,newUser);
        }
    }

//Добавляет запрос в список запросов пользователя

    public static void addRequestToUser(Request request, User user) {
        user.getUserRequestsIdList().add(request.getRequestId());
    }

}
