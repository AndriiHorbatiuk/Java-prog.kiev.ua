package Visa;

import java.util.*;

/**
 * Created by Andrey on 11.08.2016.
 */
public class Runner {
    public static void main(String[] args) {

        Request request1 = new Request();
        Request request2 = new Request();
        HashMap<Long,Integer> prices = new HashMap<>();
        prices.put(1L,100);
        prices.put(2L,500);
        prices.put(3L,3050);
        prices.put(4L,70);

        request1.requestPricesFromTravelAgencies = prices;

RequestFilters.filterSortPriceMinMax(request1);
RequestFilters.filterSortPriceMaxMin(request1);

    }
}
