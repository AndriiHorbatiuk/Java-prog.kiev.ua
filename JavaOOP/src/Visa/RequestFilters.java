package Visa;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import Visa.dataStorage.AllPriceResponds;
import Visa.dataStorage.AllTravelAgencies;
import Visa.utils.StringUtils;

/**
 * Created by Andrey on 11.08.2016.
 */
public class RequestFilters {

    static void filterSortPriceMinMax(Request request) {
//        Сортирует цены по возрастанию
        if(isNotNull(request.getPriceRespondsIdList())) {
//            Collections.sort(request.getPriceRespondsIdList());
//            System.out.println(request.getPriceRespondsIdList().toString());
            List<PriceResponds> priceRespondsList = new ArrayList<>();
                for(String s : request.getPriceRespondsIdList()){
                    priceRespondsList.add(AllPriceResponds.getAllPriceRespondsMap().get(s));
                }
            Collections.sort(priceRespondsList);
            System.out.println(priceRespondsList.toString());

        }
    }

    static void filterSortPriceMaxMin(Request request) {
//         Сортирует цены по убыванию
        if(isNotNull(request.getPriceRespondsIdList())){
            Collections.reverse(request.getPriceRespondsIdList());
            System.out.println(request.getPriceRespondsIdList().toString());
        }
    }

//    static void filterSortTravelAgencyNameAlphabet(Request request){
//        if(isNotNull(request.getPriceRespondsIdList())){
//            Collections.sort(request.getPriceRespondsIdList(), new Comparator<PriceResponds>() {
//                @Override
//                public int compare(PriceResponds o1, PriceResponds o2) {
//                    String s1 = null;
//                    String s2 = null;
//                    for(TravelAgency ta : AllTravelAgencies.getTravelAgencies()){
//                        if(o1.getTravelAgencyId().equals(ta.getTravelAgencyEmail())){
//                            s1 = ta.getTravelAgencyName();
//                        }
//                        if(o2.getTravelAgencyId().equals(ta.getTravelAgencyEmail())){
//                            s2 = ta.getTravelAgencyName();
//                        }
//                        if(StringUtils.isNotNull(s1) && StringUtils.isNotNull(s2)){
//                            break;
//                        }
//                    }
//                    return s1.compareTo(s2);
//                }
//            });
//        }
//
//    }

    private static <T> boolean isNotNull(T object){
        boolean result = (object != null)?true:false;
        return result;
    }
}
