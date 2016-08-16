package Lesson7.Comparing.Person;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by Andrey on 16.08.2016.
 */
public class Runner {
    public static void main(String[] args) {
        List<Person> listOfPersons = Arrays.asList(
                new Person("Vasia",17),
                new Person("Kolia",12),
                new Person("Anna", 29),
                new Person("Boria", 14),
                new Person("Alla",14),
                new Person("Alex",17));
        List<Person> sortedList = PersonUtils.get1217YearsOld(listOfPersons);
        System.out.println("Выбираем людей с возрастом от 12 до 17 лет: " + sortedList);
        sortedList = PersonUtils.ageNameSort(PersonUtils.get1217YearsOld(listOfPersons));
        System.out.println("Сортируем по возрасту и имени: " + sortedList);
    }


}
