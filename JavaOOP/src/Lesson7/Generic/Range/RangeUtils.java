package Lesson7.Generic.Range;

import java.math.BigDecimal;
import java.util.Comparator;

/**
 * Created by Andrey on 16.08.2016.
 */
public class RangeUtils implements Comparator<Number>{
    @Override
    public int compare(Number a, Number b) {
        return new BigDecimal(a.toString()).compareTo(new BigDecimal(b.toString()));
    }

}
