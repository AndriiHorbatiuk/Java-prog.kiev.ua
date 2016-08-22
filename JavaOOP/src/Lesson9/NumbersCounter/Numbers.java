package Lesson9.NumbersCounter;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by Andrey on 22.08.2016.
 */
public class Numbers {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,3,4,5,13,456,2,2,35,46,897,5,9,0);
        Map<Integer,Integer> countMap = new HashMap<>();
        for(int i : list){
            if(!countMap.containsKey(i)){
                countMap.put(i,1);
            }
            else{
                countMap.put(i,(countMap.get(i)+1));
            }
        }
        System.out.println(countMap);
    }
}
