package Visa.dataStorage;

import Visa.TravelAgency;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by Andrey on 17.08.2016.
 */
public final class AllTravelAgencies implements Serializable {
    private static final long serialVersionUID = -3765330724073400694L;
    private static List<TravelAgency> allTravelAgencies = new ArrayList<>();
    private static Map<String,TravelAgency> allTravelAgenciesMap = new HashMap<>();

    public static Map<String, TravelAgency> getAllTravelAgenciesMap() {
        return allTravelAgenciesMap;
    }

    public static List<TravelAgency> getTravelAgencies() {
        return allTravelAgencies;
    }
}
