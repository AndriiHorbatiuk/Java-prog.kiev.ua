package Visa;

import Visa.dataStorage.AllPriceResponds;
import Visa.dataStorage.AllRequests;
import Visa.dataStorage.AllTravelAgencies;
import Visa.dataStorage.AllUsers;
import Visa.enums.City;
import Visa.enums.Country;

import java.io.*;

/**
 * Created by Andrey on 11.08.2016.
 */
public class Runner {
    public static void main(String[] args) {

        System.out.println(AllUsers.getAllUsersMap().toString());
        System.out.println(AllRequests.getAllRequestsMap().toString());
        System.out.println(AllPriceResponds.getAllPriceRespondsMap().toString());
        System.out.println(AllTravelAgencies.getAllTravelAgenciesMap().toString());

//Создаем запрос на визу

        Request request1 = new Request("email2@domain.com");
        request1.setNumberOfPersonsInRequest((byte) 1);
        request1.setRequestCountry(Country.COUNTRY.getCOUNTRIES().get(0));
        request1.setStartTripDate(System.currentTimeMillis());
        request1.setLastTripDate(System.currentTimeMillis() + 123343455L);

        Request request2 = new Request("email23@domain.com");
        request2.setNumberOfPersonsInRequest((byte) 3);
        request2.setRequestCountry(Country.COUNTRY.getCOUNTRIES().get(1));
        request2.setStartTripDate(System.currentTimeMillis());
        request2.setLastTripDate(System.currentTimeMillis() + 723343455L);

        TravelAgency ta = new TravelAgency("ta@email.com", "Агентство 1");
        TravelAgency ta2 = new TravelAgency("ta2@email.com", "Агентство 2");
        TravelAgency ta3 = new TravelAgency("ta3@email.com", "Агентство 3");

        ta.setTravelAgencyCity(City.CITY.getCITIES().get(0));
        ta.setGetTravelAgencyWebSiteUrl("http://domain.com.ua");
        ta.setTravelAgencyEmail("ta@email.com");
        ta.setTravelAgencyHouseNumber("12");
        ta.setTravelAgencyStreet("Волкова");
        ta.setTravelAgencyTelNumber("0445556677");

        ta2.setTravelAgencyCity(City.CITY.getCITIES().get(0));
        ta2.setGetTravelAgencyWebSiteUrl("http://domainta2.com.ua");
        ta2.setTravelAgencyHouseNumber("100");
        ta2.setTravelAgencyStreet("Харьковская");
        ta2.setTravelAgencyTelNumber("0445568777");

        ta3.setTravelAgencyCity(City.CITY.getCITIES().get(0));
//        ta3.setGetTravelAgencyWebSiteUrl("http://domainta3.com.ua");
        ta3.setTravelAgencyHouseNumber("8");
        ta3.setTravelAgencyStreet("Быкова");
        ta3.setTravelAgencyTelNumber("0445156677");

        PriceResponds pr1 = new PriceResponds(ta2.getTravelAgencyEmail(), request1.getRequestId(), 400);
        PriceResponds pr2 = new PriceResponds(ta3.getTravelAgencyEmail(), request1.getRequestId(), 120);
        PriceResponds pr3 = new PriceResponds(ta.getTravelAgencyEmail(), request1.getRequestId(), 1030);

        System.out.println(AllUsers.getAllUsersMap().toString());
        System.out.println(AllRequests.getAllRequestsMap().toString());
        System.out.println(AllPriceResponds.getAllPriceRespondsMap().toString());
        System.out.println(AllTravelAgencies.getAllTravelAgenciesMap().toString());

//        try {
//            FileInputStream fileInputStream = new FileInputStream("resps.txt");
//            ObjectInputStream os = new ObjectInputStream(fileInputStream);
//            request1.setPriceRespondsIdList((List<PriceResponds>) os.readObject());
//        } catch (FileNotFoundException e) {
//            e.printStackTrace();
//        } catch (IOException e) {
//            e.printStackTrace();
//        } catch (ClassNotFoundException e) {
//            e.printStackTrace();
//        }

// Читаем заявку из файла

//        Request request1 = null;
//        try {
//            FileInputStream fileInputStream = new FileInputStream("requests.txt");
//            ObjectInputStream os = new ObjectInputStream(fileInputStream);
//            request1 = (Request) os.readObject();
//        } catch (FileNotFoundException e) {
//            e.printStackTrace();
//        } catch (IOException e) {
//            e.printStackTrace();
//        } catch (ClassNotFoundException e) {
//            e.printStackTrace();
//        }

// Выполняем сортировки

        System.out.println("От меньщей цены к большей:");
        PriceRespondSorting.filterSortPriceMinMax(request1.getRequestId());
        System.out.println("От большей цены к меньшей:");
        PriceRespondSorting.filterSortPriceMaxMin(request1.getRequestId());
        System.out.println("Сортируем по наименованию агентства:");
        PriceRespondSorting.filterSortTravelAgencyNameAlphabet(request1.getRequestId());
        System.out.println("Сортируем по имени улицы агентства:");
        PriceRespondSorting.filterSortTravelAgencyStreetNameAlphabet(request1.getRequestId());

//Выполняем фильтрацию
        System.out.println("Фильтруем по цене: ");
        PriceRespondFiltering.filterByPrice(request1.getRequestId(),200,400);
        System.out.println("Отобразить только ответы от агентств, у которых есть веб сайт: ");
        PriceRespondFiltering.filterTravelAgencyHaveWebSite(request1.getRequestId());

//Отобразить дату в читабельном виде

        System.out.print("День создания заявки: ");
        RequestUtils.convertMillisecondsToDate(request1.getDateOfRequestCreation());
        System.out.println("День начала путешествия: ");
        RequestUtils.convertMillisecondsToDate(request1.getStartTripDate());
        System.out.println("День окончания путешествия: ");
        RequestUtils.convertMillisecondsToDate(request1.getLastTripDate());

//Записываем в файл массив предложений

        try {
            FileOutputStream fileOutputStream = new FileOutputStream("allUsers.txt");
            FileOutputStream fileOutputStream2 = new FileOutputStream("allRequests.txt");
            FileOutputStream fileOutputStream3 = new FileOutputStream("allTravelAgencies.txt");
            ObjectOutputStream os = new ObjectOutputStream(fileOutputStream);
            ObjectOutputStream os2 = new ObjectOutputStream(fileOutputStream2);
            ObjectOutputStream os3 = new ObjectOutputStream(fileOutputStream3);
            os.writeObject(AllUsers.getAllUsersMap());
            os.close();
            os2.writeObject(AllRequests.getAllRequestsMap());
            os2.close();
            os3.writeObject(AllTravelAgencies.getTravelAgencies());
            os3.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
