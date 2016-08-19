package Visa.dataStorage;

import Visa.User;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by Andrey on 17.08.2016.
 */
public final class AllUsers implements Serializable {
    private static final long serialVersionUID = 2270591637074953797L;
    private static Map<String, User> allUsersMap = new HashMap<>();

    public static Map<String, User> getAllUsersMap() {
        return allUsersMap;
    }
}
