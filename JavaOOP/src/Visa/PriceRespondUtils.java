package Visa;

import Visa.dataStorage.AllPriceResponds;
import Visa.dataStorage.AllRequests;
import Visa.utils.ExceptionUtils;
import Visa.utils.ObjectUtils;
import Visa.utils.StringUtils;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Andrey on 19.08.2016.
 */
public class PriceRespondUtils {
    public static List<PriceResponds> getRespondListFromRequestId(String requestId) throws NullPointerException, IllegalArgumentException {
        ExceptionUtils.checkStringOnNull(requestId);
        ExceptionUtils.checkStringOnEmpty(requestId);
        ExceptionUtils.checkObjectOnNull(AllRequests.getAllRequestsMap().get(requestId));
        ExceptionUtils.checkObjectOnNull(AllRequests.getAllRequestsMap().get(requestId).getPriceRespondsIdList());

        Request request = AllRequests.getAllRequestsMap().get(requestId);
        List<PriceResponds> priceRespondsList = new ArrayList<>();
        for (String s : request.getPriceRespondsIdList()) {
            priceRespondsList.add(AllPriceResponds.getAllPriceRespondsMap().get(s));
        }
        return priceRespondsList;
    }

    public static boolean isRespondFromTravelAgency(String travelAgencyId, String requestId) {
       List<String> listOfResponds = AllRequests.getAllRequestsMap().get(requestId).getPriceRespondsIdList();
        for(String s : listOfResponds){
            if(AllPriceResponds.getAllPriceRespondsMap().get(s).getTravelAgencyId().equals(travelAgencyId)){
                return true;
            }
        }
        return false;

    }

}

