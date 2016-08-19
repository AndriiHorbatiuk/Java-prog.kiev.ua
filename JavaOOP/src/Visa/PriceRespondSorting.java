package Visa;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import Visa.dataStorage.AllPriceResponds;
import Visa.dataStorage.AllRequests;
import Visa.dataStorage.AllTravelAgencies;
import Visa.utils.ObjectUtils;

class PriceRespondSorting {



    static void filterSortPriceMinMax(String requestId) {
//        Сортирует цены по возрастанию
        List<PriceResponds> priceRespondsList = new ArrayList<>();
        priceRespondsList = PriceRespondUtils.getRespondListFromRequestId(requestId);
        if (ObjectUtils.isNotNull(priceRespondsList)) {
            Collections.sort(priceRespondsList);
            System.out.println(priceRespondsList.toString());
        }
    }

    static void filterSortPriceMaxMin(String requestId) {
//         Сортирует цены по убыванию
        List<PriceResponds> priceRespondsList;
        priceRespondsList = PriceRespondUtils.getRespondListFromRequestId(requestId);
        if (ObjectUtils.isNotNull(priceRespondsList)) {
            Comparator cmp = Collections.reverseOrder();
            Collections.sort(priceRespondsList, cmp);
            System.out.println(priceRespondsList.toString());
        }
    }

    static void filterSortTravelAgencyNameAlphabet(String requestId) {
//      Сортирует по имени агентства
        List<PriceResponds> priceRespondsList = new ArrayList<>();
        priceRespondsList = PriceRespondUtils.getRespondListFromRequestId(requestId);
        if (ObjectUtils.isNotNull(priceRespondsList)) {
            Collections.sort(priceRespondsList, new Comparator<PriceResponds>() {
                @Override
                public int compare(PriceResponds o1, PriceResponds o2) {
                    return AllTravelAgencies.getAllTravelAgenciesMap().get(o1.getTravelAgencyId()).getTravelAgencyName().compareTo(AllTravelAgencies.getAllTravelAgenciesMap().get(o2.getTravelAgencyId()).getTravelAgencyName());
                }
            });
            System.out.println(priceRespondsList.toString());

        }
    }

    static void filterSortTravelAgencyStreetNameAlphabet(String requestId) {
//      Сортирует по имени агентства
        List<PriceResponds> priceRespondsList = new ArrayList<>();
        priceRespondsList = PriceRespondUtils.getRespondListFromRequestId(requestId);
        if (ObjectUtils.isNotNull(priceRespondsList)) {
            Collections.sort(priceRespondsList, new Comparator<PriceResponds>() {
                @Override
                public int compare(PriceResponds o1, PriceResponds o2) {
                    return AllTravelAgencies.getAllTravelAgenciesMap().get(o1.getTravelAgencyId()).getTravelAgencyStreet().compareTo(AllTravelAgencies.getAllTravelAgenciesMap().get(o2.getTravelAgencyId()).getTravelAgencyStreet());
                }
            });
            System.out.println(priceRespondsList.toString());

        }
    }

}
