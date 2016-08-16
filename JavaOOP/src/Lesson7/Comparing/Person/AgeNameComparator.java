package Lesson7.Comparing.Person;

import java.util.Comparator;

/**
 * Created by Andrey on 16.08.2016.
 */
public class AgeNameComparator implements Comparator<Person> {
    @Override
    public int compare(Person p1, Person p2) {
        int result;
        result = Integer.compare(p2.getAge(), p1.getAge());
        if(result == 0){
            return p1.getName().compareTo(p2.getName());
        }
        else{
            return result;
        }
    }
}
