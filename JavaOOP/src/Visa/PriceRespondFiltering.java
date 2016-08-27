package Visa;

import Visa.dataStorage.AllTravelAgencies;
import Visa.utils.ExceptionUtils;
import Visa.utils.ObjectUtils;
import Visa.utils.StringUtils;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Andrey on 19.08.2016.
 */
public class PriceRespondFiltering {

    //Фильтруем по цене

    static void filterByPrice(String requestId, int fromNum, int toNum) throws NullPointerException, IllegalArgumentException {
        ExceptionUtils.checkStringOnNull(requestId);
        ExceptionUtils.checkStringOnEmpty(requestId);
        ExceptionUtils.checkObjectOnNull(PriceRespondUtils.getRespondListFromRequestId(requestId));
        ExceptionUtils.checkIntIsInt(fromNum);
        ExceptionUtils.checkIntIsInt(toNum);

        List<PriceResponds> filteredList = new ArrayList<>();
        for (PriceResponds pr : PriceRespondUtils.getRespondListFromRequestId(requestId)) {
            if (pr.getPrice() >= fromNum && pr.getPrice() <= toNum) {
                filteredList.add(pr);
            }
        }

        System.out.println(filteredList.toString());    //return
    }

    static void filterTravelAgencyHaveWebSite(String requestId) throws NullPointerException, IllegalArgumentException{
        ExceptionUtils.checkStringOnNull(requestId);
        ExceptionUtils.checkStringOnEmpty(requestId);
        ExceptionUtils.checkObjectOnNull(PriceRespondUtils.getRespondListFromRequestId(requestId));

        List<PriceResponds> filteredList = new ArrayList<>();
        for (PriceResponds pr : PriceRespondUtils.getRespondListFromRequestId(requestId)) {
            if (ObjectUtils.isNotNull(AllTravelAgencies.getAllTravelAgenciesMap().get(pr.getTravelAgencyId()).getGetTravelAgencyWebSiteUrl())) {
                filteredList.add(pr);
            }
        }
        System.out.println(filteredList.toString());    //return
    }

}
