package Visa;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Created by Andrey on 11.08.2016.
 */
public class RequestFilters {

    static void filterSortPriceMinMax(Request request) {
//        Сортирует цены по возрастанию
        Exceptions.nullHashmapChecker(request.requestPricesFromTravelAgencies);
        List<Integer> list = new ArrayList<>();
        list.addAll(request.requestPricesFromTravelAgencies.values());
        Collections.sort(list);
        System.out.println(list.toString());
    }

    static void filterSortPriceMaxMin(Request request) {
//         Сортирует цены по убыванию
        Exceptions.nullHashmapChecker(request.requestPricesFromTravelAgencies);
        List<Integer> list = new ArrayList<>();
        list.addAll(request.requestPricesFromTravelAgencies.values());
        list.sort(Collections.reverseOrder());
        System.out.println(list.toString());

    }
}
