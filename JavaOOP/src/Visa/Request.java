package Visa;

import java.util.HashMap;
import java.util.List;

/**
 * Created by Andrey on 11.08.2016.
 */
public class Request {
    private String requestCountry;
    private short numberOfPersonsInRequest;
    private long startTripDate;
    private long lastTripDate;
    private String userEmailInRequest;
    private long requestId;
    private long dateOfRequestCreation;
    public HashMap<Long,Integer> requestPricesFromTravelAgencies; //@TODO убрать public
}
