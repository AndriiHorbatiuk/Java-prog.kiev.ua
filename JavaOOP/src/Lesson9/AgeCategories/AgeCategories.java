package Lesson9.AgeCategories;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/**
 * Created by Andrey on 22.08.2016.
 */
public class AgeCategories {

    public static void main(String[] args) {

        List<Person> persons = new ArrayList<>();
        persons.add(new Person("Vasia",21));
        persons.add(new Person("Alex",11));
        persons.add(new Person("Alex",45));
        persons.add(new Person("Zorro",34));
        persons.add(new Person("Bond",78));
        persons.add(new Person("Kolia",21));
        persons.add(new Person("Kolia",16));
        persons.add(new Person("Kolia",14));

        System.out.println("Весь список: " + persons.toString());

        TreeMap<Integer, Person> map = new TreeMap<>();
        for(Person p : persons){
            map.put(p.getAge(),p);
        }
        System.out.println("Найти всех людей подроствого возраста (от 12 до 17 лет): ");
        System.out.println(map.subMap(12,18));
        System.out.println("Найти младшего человека, старше 18 лет: ");
        System.out.println(map.higherEntry(18));


        System.out.println("Найти старшего человека, младше 18 лет:");
        System.out.println(map.floorEntry(18));
    }





    public static class Person implements Comparable<Person> {

        private String name;
        private int age;

        public Person(String name, int age) {
            this.name = name;
            this.age = age;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }

        @Override
        public int compareTo(Person p) {
            return name.compareTo(p.getName());
        }

        @Override
        public String toString() {
            return "Person{" +
                    "name='" + name + '\'' +
                    ", age=" + age +
                    '}';
        }
    }
}
