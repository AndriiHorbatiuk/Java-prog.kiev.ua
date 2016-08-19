package Visa;

import Visa.dataStorage.AllPriceResponds;
import Visa.dataStorage.AllRequests;
import Visa.utils.ObjectUtils;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Andrey on 19.08.2016.
 */
public class PriceRespondUtils {
    static List<PriceResponds> getRespondListFromRequestId(String requestId) throws NullPointerException {
        Request request = AllRequests.getAllRequestsMap().get(requestId);
        List<PriceResponds> priceRespondsList = new ArrayList<>();
        if (ObjectUtils.isNotNull(request.getPriceRespondsIdList())) {
            for (String s : request.getPriceRespondsIdList()) {
                priceRespondsList.add(AllPriceResponds.getAllPriceRespondsMap().get(s));
            }
            return priceRespondsList;
        }
        return priceRespondsList;
    }
}
