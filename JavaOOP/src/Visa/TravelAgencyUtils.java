package Visa;

import Visa.dataStorage.AllTravelAgencies;
import Visa.utils.ExceptionUtils;
import Visa.utils.StringUtils;

import java.util.Scanner;

/**
 * Created by Andrey on 17.08.2016.
 */
public class TravelAgencyUtils {

    static boolean checkTravelAgencyExistence(String travelAgencyId) {
        ExceptionUtils.checkStringOnNull(travelAgencyId);
        ExceptionUtils.checkStringOnEmpty(travelAgencyId);

        return AllTravelAgencies.getAllTravelAgenciesMap().containsKey(travelAgencyId);
    }

   public static void addPriceRespond(String requestId, String travelAgencyId, int price) throws NullPointerException, IllegalArgumentException {
        ExceptionUtils.checkStringOnNull(requestId);
        ExceptionUtils.checkStringOnNull(travelAgencyId);
        ExceptionUtils.checkStringOnEmpty(requestId);
        ExceptionUtils.checkStringOnEmpty(travelAgencyId);

        new PriceResponds(travelAgencyId, requestId, price);
    }

    public static int getPrice() {
        Scanner sc = new Scanner(System.in);
        int price = sc.nextInt();
        return price;
    }
}
