package Visa;

import Visa.dataStorage.AllPriceResponds;
import Visa.dataStorage.AllRequests;
import Visa.dataStorage.AllTravelAgencies;
import Visa.dataStorage.AllUsers;
import Visa.utils.FileUtils;

import java.util.*;

/**
 * Created by Andrey on 11.08.2016.
 */
public class Runner {
    public static void main(String[] args) {
        FileUtils.readAllDataFromFiles();
        System.out.println(AllRequests.getAllRequestsMap().size());
        System.out.println(AllUsers.getAllUsersMap().size());
        System.out.println(AllPriceResponds.getAllPriceRespondsMap().size());
        System.out.println(AllTravelAgencies.getAllTravelAgenciesMap().size());

//        FileUtils.readAllUsersFromReadableFile();
//        FileUtils.readAllTravelAgenciesFromReadableFile();
//        FileUtils.readAllRequestsFromReadableFile();
//        FileUtils.readAllPriceRespondsFromReadableFile();

//        FileUtils.writeDataToFiles();

        Iterator it = AllRequests.getAllRequestsMap().entrySet().iterator();
        List<Request> listOfRequests = new ArrayList<>();
        while (it.hasNext()) {
            Map.Entry pair = (Map.Entry) it.next();
            if (((Request) pair.getValue()).getPriceRespondsIdList().size() >= 2) {
                System.out.println(((Request) pair.getValue()).getRequestId());
            }
            it.remove(); // avoids a ConcurrentModificationException
        }
    }
}
