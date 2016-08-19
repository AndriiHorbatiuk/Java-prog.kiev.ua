package Visa.dataStorage;

import Visa.PriceResponds;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by Andrey on 19.08.2016.
 */
public final class AllPriceResponds implements Serializable {

    private static final long serialVersionUID = 6169497914097508729L;
    private static final Map<String, PriceResponds> allPriceRespondsMap = new HashMap<>();

    public static Map<String, PriceResponds> getAllPriceRespondsMap() {
        return allPriceRespondsMap;
    }
}
