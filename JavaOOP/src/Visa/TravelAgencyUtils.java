package Visa;

import java.util.Scanner;

/**
 * Created by Andrey on 17.08.2016.
 */
public class TravelAgencyUtils {
    void addRequestPrice(Request request, TravelAgency travelAgency, int price) {
//        if (!checkWasNotResponseEarlier(request, travelAgency)) {
//            PriceResponds priceRespond = new PriceResponds(request.getRequestId(), travelAgency.getTravelAgencyEmail(), price);
//            request.getPriceRespondsIdList().add(priceRespond);
//            travelAgency.getResponsesOfTravelAgency().add(request);
//        }
    }

    boolean checkWasNotResponseEarlier(Request request, TravelAgency travelAgency) {
        boolean result = false;
        for (Request r : travelAgency.getResponsesOfTravelAgency()) {
            if (r == request) {
                result = true;
                break;
            }
        }
        return result;
    }

    int getPrice() {
        Scanner sc = new Scanner(System.in);
        int price = sc.nextInt();
        return price;
    }
}
