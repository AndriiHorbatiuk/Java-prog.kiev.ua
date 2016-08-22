package Lesson9.Unique;

import java.util.*;

/**
 * Created by Andrey on 21.08.2016.
 */
public class Unique {
    public static void main(String[] args) {
        List<Person> pesons = new ArrayList<>();
        pesons.add(new Person("Vasia"));
        pesons.add(new Person("Alex"));
        pesons.add(new Person("Alex"));
        pesons.add(new Person("Zorro"));
        pesons.add(new Person("Bond"));
        pesons.add(new Person("Kolia"));
        Set<Person> setOfPersons = new TreeSet<>(pesons);
        System.out.println(setOfPersons.toString());

    }

    public static class Person implements Comparable<Person> {

        private String name;

        public Person(String name) {
            this.name = name;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        @Override
        public int compareTo(Person p) {
            return name.compareTo(p.getName());
        }

        @Override
        public String toString() {
            return "Person{" +
                    "name='" + name + '\'' +
                    '}';
        }
    }
}
