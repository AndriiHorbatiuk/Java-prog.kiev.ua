package Visa;

import Visa.dataStorage.AllPriceResponds;
import Visa.dataStorage.AllRequests;
import Visa.dataStorage.AllTravelAgencies;

import java.io.Serializable;
import java.util.UUID;

/**
 * Created by Andrey on 17.08.2016.
 */
public class PriceResponds implements Comparable<PriceResponds>, Serializable {
    private static final long serialVersionUID = -7458965517785145503L;
    private String travelAgencyId;
    private String requestId;
    private final String priceRespondId;
    private int price;

    public PriceResponds(String travelAgencyId, String requestId, int price) {
        this.travelAgencyId = travelAgencyId;
        this.requestId = requestId;
        this.price = price;
        priceRespondId = UUID.randomUUID().toString(); //Generate random id
        AllPriceResponds.getAllPriceRespondsMap().put(priceRespondId,this); //Place itself to the list of all responds
        AllRequests.getAllRequestsMap().get(requestId).getPriceRespondsIdList().add(priceRespondId);
        AllTravelAgencies.getAllTravelAgenciesMap().get(travelAgencyId).getRespondsOfTravelAgency().add(priceRespondId);
        System.out.println("Respond creation success");
    }

    public String getTravelAgencyId() {
        return travelAgencyId;
    }

    public void setTravelAgencyId(String travelAgencyId) {
        this.travelAgencyId = travelAgencyId;
    }

    public String getRequestId() {
        return requestId;
    }

    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        PriceResponds that = (PriceResponds) o;

        if (price != that.price) return false;
        if (!travelAgencyId.equals(that.travelAgencyId)) return false;
        return requestId != null ? requestId.equals(that.requestId) : that.requestId == null;

    }

    @Override
    public int hashCode() {
        int result = travelAgencyId.hashCode();
        result = 31 * result + requestId.hashCode();
        result = 31 * result + price;
        return result;
    }

    @Override
    public int compareTo(PriceResponds o) {
        return Integer.compare(price, o.getPrice());
    }

    @Override
    public String toString() {
        return "PriceResponds{" +
                "price=" + price +
                '}';
    }
}
