package Visa.dataStorage;

import Visa.Request;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by Andrey on 17.08.2016.
 */
public final class AllRequests implements Serializable{
    private static final long serialVersionUID = 7832458871396222148L;
    private static Map<String, Request> allRequestsMap = new HashMap<>();

    public static Map<String, Request> getAllRequestsMap() {
        return allRequestsMap;
    }
}
