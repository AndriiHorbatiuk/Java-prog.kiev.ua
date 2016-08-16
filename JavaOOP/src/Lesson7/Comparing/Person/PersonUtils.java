package Lesson7.Comparing.Person;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Created by Andrey on 16.08.2016.
 */
public class PersonUtils {
    public static List<Person> get1217YearsOld(List<Person> list){
        List<Person> resultList = new ArrayList<>();
        for(Person p : list){
            if(p.getAge() >= 12 && p.getAge() <= 17){
                resultList.add(p);
            }
        }

        return resultList;
    }

    public static List<Person> ageNameSort(List<Person> list){
        Collections.sort(list, new AgeNameComparator());
        return list;
    }
}
