package Visa;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import Visa.dataStorage.AllPriceResponds;
import Visa.dataStorage.AllRequests;
import Visa.dataStorage.AllTravelAgencies;
import Visa.utils.ExceptionUtils;
import Visa.utils.ObjectUtils;

class PriceRespondSorting {


    static void sortPriceMinMax(String requestId) throws NullPointerException, IllegalArgumentException {
//        Сортирует цены по возрастанию
        ExceptionUtils.checkStringOnNull(requestId);
        ExceptionUtils.checkStringOnEmpty(requestId);
        ExceptionUtils.checkObjectOnNull(PriceRespondUtils.getRespondListFromRequestId(requestId));

        Collections.sort(PriceRespondUtils.getRespondListFromRequestId(requestId));
        System.out.println(PriceRespondUtils.getRespondListFromRequestId(requestId).toString()); // return
    }

    static void sortPriceMaxMin(String requestId) throws NullPointerException, IllegalArgumentException {
//      Сортирует цены по убыванию
        ExceptionUtils.checkStringOnNull(requestId);
        ExceptionUtils.checkStringOnEmpty(requestId);
        ExceptionUtils.checkObjectOnNull(PriceRespondUtils.getRespondListFromRequestId(requestId));

        Comparator cmp = Collections.reverseOrder();
        Collections.sort(PriceRespondUtils.getRespondListFromRequestId(requestId), cmp);
        System.out.println(PriceRespondUtils.getRespondListFromRequestId(requestId).toString()); // return
    }

    static void sortTravelAgencyNameAlphabet(String requestId) throws NullPointerException, IllegalArgumentException {
//      Сортирует по имени агентства
        ExceptionUtils.checkStringOnNull(requestId);
        ExceptionUtils.checkStringOnEmpty(requestId);
        ExceptionUtils.checkObjectOnNull(PriceRespondUtils.getRespondListFromRequestId(requestId));

        Collections.sort(PriceRespondUtils.getRespondListFromRequestId(requestId), new Comparator<PriceResponds>() {
            @Override
            public int compare(PriceResponds o1, PriceResponds o2) {
                return AllTravelAgencies.getAllTravelAgenciesMap().get(o1.getTravelAgencyId()).getTravelAgencyName().compareTo(AllTravelAgencies.getAllTravelAgenciesMap().get(o2.getTravelAgencyId()).getTravelAgencyName());
            }
        });
        System.out.println(PriceRespondUtils.getRespondListFromRequestId(requestId).toString()); // return
    }

    static void sortTravelAgencyStreetNameAlphabet(String requestId) throws NullPointerException, IllegalArgumentException {
//      Сортирует по имениулицы, на котором находится агентство
        ExceptionUtils.checkStringOnNull(requestId);
        ExceptionUtils.checkStringOnEmpty(requestId);
        ExceptionUtils.checkObjectOnNull(PriceRespondUtils.getRespondListFromRequestId(requestId));

        Collections.sort(PriceRespondUtils.getRespondListFromRequestId(requestId), new Comparator<PriceResponds>() {
            @Override
            public int compare(PriceResponds o1, PriceResponds o2) {
                return AllTravelAgencies.getAllTravelAgenciesMap().get(o1.getTravelAgencyId()).getTravelAgencyStreet().compareTo(AllTravelAgencies.getAllTravelAgenciesMap().get(o2.getTravelAgencyId()).getTravelAgencyStreet());
            }
        });
        System.out.println(PriceRespondUtils.getRespondListFromRequestId(requestId).toString());

    }

    static void sortMinMaxPriceTravelAgencyNameAlphabetStreetNameAlphabet(String requestId) throws NullPointerException, IllegalArgumentException {
//      Сортирует по имени агентства
        ExceptionUtils.checkStringOnNull(requestId);
        ExceptionUtils.checkStringOnEmpty(requestId);
        ExceptionUtils.checkObjectOnNull(PriceRespondUtils.getRespondListFromRequestId(requestId));

        Collections.sort(PriceRespondUtils.getRespondListFromRequestId(requestId), new Comparator<PriceResponds>() {
            @Override
            public int compare(PriceResponds o1, PriceResponds o2) {
                int result;
                result = Integer.compare(o1.getPrice(), o2.getPrice());
                if (result == 0) {
                    result = AllTravelAgencies.getAllTravelAgenciesMap().get(o1.getTravelAgencyId()).getTravelAgencyName().compareTo(AllTravelAgencies.getAllTravelAgenciesMap().get(o2.getTravelAgencyId()).getTravelAgencyName());
                    if (result == 0) {
                        result = AllTravelAgencies.getAllTravelAgenciesMap().get(o1.getTravelAgencyId()).getTravelAgencyStreet().compareTo(AllTravelAgencies.getAllTravelAgenciesMap().get(o2.getTravelAgencyId()).getTravelAgencyStreet());
                    }
                }
                return result;
            }
        });
        System.out.println(PriceRespondUtils.getRespondListFromRequestId(requestId).toString()); // return
    }

}
