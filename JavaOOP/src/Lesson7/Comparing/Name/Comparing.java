package Lesson7.Comparing.Name;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * Created by Andrey on 15.08.2016.
 */
public class Comparing {
    private List<String> list;

    public Comparing(List<String> list) {
        this.list = list;
    }

    public void sortAlphabet() {
        Collections.sort(list);
        System.out.println("По алфавиту: " + list.toString());
    }

    public void sortReverseAlphabet() {
        list.sort(Collections.reverseOrder());
        System.out.println("В обратном порядке: " + list.toString());
    }

    public void minName() {
        System.out.println("Минимальное значение: " + Collections.min(list, String::compareTo));
    }

    public void stringLength() {
        Collections.sort(list, new LengthComparator());
        System.out.println("По длинне: "+list);
    }

    public void stringLengthWithParams() {
        Collections.sort(list, new LengthComparator());
        Collections.sort(list, new SameComparator());
        System.out.println("По длинне, в группах - в обратном порядке: " + list);
    }

    public List<String> getList() {
        return list;
    }

    public void setList(List<String> list) {
        this.list = list;
    }

    public class SameComparator implements Comparator<String> {

        @Override
        public int compare(String o1, String o2) {
            int len1 = o1.length();
            int len2 = o2.length();
            int lim = len1;
            char v1[] = o1.toCharArray();
            char v2[] = o2.toCharArray();
            int k = 0;
            if (len1 == len2) {
                while (k < lim) {
                    char c1 = v1[k];
                    char c2 = v2[k];
                    if (c1 != c2) {
                        return c2 - c1;
                    }
                    k++;
                }
            }


            return 0;
        }
    }
}
