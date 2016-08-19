package Visa;

import Visa.dataStorage.AllTravelAgencies;
import Visa.utils.ObjectUtils;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Andrey on 19.08.2016.
 */
public class PriceRespondFiltering {

    //Фильтруем по цене

    static void filterByPrice(String requestId, int fromNum, int toNum){
        List<PriceResponds> priceRespondsList;
        priceRespondsList = PriceRespondUtils.getRespondListFromRequestId(requestId);
        List<PriceResponds> filteredList = new ArrayList<>();
        if (ObjectUtils.isNotNull(priceRespondsList)) {
            for(PriceResponds pr : priceRespondsList){
                if(pr.getPrice() >= fromNum && pr.getPrice() <= toNum){
                    filteredList.add(pr);
                }
            }
        }
        System.out.println(filteredList.toString());
    }

    static void filterTravelAgencyHaveWebSite(String requestId){
        List<PriceResponds> priceRespondsList;
        priceRespondsList = PriceRespondUtils.getRespondListFromRequestId(requestId);
        List<PriceResponds> filteredList = new ArrayList<>();
        if (ObjectUtils.isNotNull(priceRespondsList)) {
            for(PriceResponds pr : priceRespondsList){
                if(ObjectUtils.isNotNull(AllTravelAgencies.getAllTravelAgenciesMap().get(pr.getTravelAgencyId()).getGetTravelAgencyWebSiteUrl())){
                    filteredList.add(pr);
                }
            }
        }
        System.out.println(filteredList.toString());
    }
}
