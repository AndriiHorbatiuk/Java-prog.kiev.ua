package Visa;

import Visa.dataStorage.AllPriceResponds;
import Visa.dataStorage.AllRequests;
import Visa.dataStorage.AllTravelAgencies;
import Visa.constants.priceConstants;

import java.io.Serializable;
import java.util.UUID;

/**
 * Created by Andrey on 17.08.2016.
 */
public final class PriceResponds implements Comparable<PriceResponds>, Serializable {
    private static final long serialVersionUID = -7458965517785145503L;
    private String travelAgencyId;
    private String requestId;
    private final String priceRespondId;
    private int price;

    public PriceResponds(String travelAgencyId, String requestId, int price) {
        priceRespondId = UUID.randomUUID().toString(); //Generate random id
        if(!TravelAgencyUtils.checkTravelAgencyExistence(travelAgencyId)){
            throw new IllegalArgumentException("No such Travel Agency in DB. Travel Agency id: " + travelAgencyId);
        }
        if(!RequestUtils.checkRequestExistence(requestId)){
            throw new IllegalArgumentException("No such request in DB. Request id: " + requestId);
        }
        if(price <= priceConstants.MINIMAL_PRICE || price > priceConstants.MAXIMAL_PRICE){
            throw new IllegalArgumentException("Price should be more than " + priceConstants.MINIMAL_PRICE + " and less than " + priceConstants.MAXIMAL_PRICE);
        }
        if(PriceRespondUtils.isRespondFromTravelAgency(travelAgencyId,requestId)){
            return;
        }
        this.travelAgencyId = travelAgencyId;
        this.requestId = requestId;
        this.price = price;
        AllPriceResponds.getAllPriceRespondsMap().put(priceRespondId,this); //Place itself to the list of all responds
        AllRequests.getAllRequestsMap().get(requestId).getPriceRespondsIdList().add(priceRespondId); //Add respond to the request
        AllTravelAgencies.getAllTravelAgenciesMap().get(travelAgencyId).getRespondsOfTravelAgency().add(priceRespondId); //Add respond to the travel agencie responds
    }

    public String getTravelAgencyId() {
        return travelAgencyId;
    }

    public String getRequestId() {
        return requestId;
    }

    public int getPrice() {
        return price;
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
