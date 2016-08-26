package Visa;

import Visa.dataStorage.AllRequests;
import Visa.dataStorage.AllUsers;
import Visa.utils.ExceptionUtils;

/**
 * Created by Andrey on 17.08.2016.
 */
public class UserUtils {

    //Проверяет: существует ли пользователь в общем списке пользователей

    static boolean checkUserExistence(String userId) {
        ExceptionUtils.checkStringOnNull(userId);
        ExceptionUtils.checkStringOnEmpty(userId);

        return AllUsers.getAllUsersMap().containsKey(userId);
    }

    //Обработка нового запроса (с проверкой на существование пользователя)
    static void checkUserNewRequest(String userEmailInRequest, String requestId) throws NullPointerException, IllegalArgumentException {
        ExceptionUtils.checkStringOnNull(userEmailInRequest);
        ExceptionUtils.checkStringOnEmpty(userEmailInRequest);
        ExceptionUtils.checkStringOnNull(requestId);
        ExceptionUtils.checkStringOnEmpty(requestId);

        if (checkUserExistence(userEmailInRequest)) {
            addRequestToUser(requestId, userEmailInRequest);
        } else {
            new User(userEmailInRequest);
            addRequestToUser(requestId,userEmailInRequest);
        }
    }

//Добавляет запрос в список запросов пользователя

    static void addRequestToUser(String requestId, String userId) throws NullPointerException, IllegalArgumentException {
        ExceptionUtils.checkStringOnNull(userId);
        ExceptionUtils.checkStringOnEmpty(userId);
        ExceptionUtils.checkStringOnNull(requestId);
        ExceptionUtils.checkStringOnEmpty(requestId);

        AllUsers.getAllUsersMap().get(userId).getUserRequestsIdList().add(requestId);
    }

}
