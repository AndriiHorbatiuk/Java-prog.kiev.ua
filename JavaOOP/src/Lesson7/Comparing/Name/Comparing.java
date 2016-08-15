package Lesson7.Comparing.Name;

import java.util.Collections;
import java.util.List;

/**
 * Created by Andrey on 15.08.2016.
 */
public class Comparing {
    private List<String> list;

    public Comparing(List<String> list) {
        this.list = list;
    }

    public void sortAlpabet(){
        Collections.sort(list);
        System.out.println(list.toString());
    }




    public List<String> getList() {
        return list;
    }

    public void setList(List<String> list) {
        this.list = list;
    }
}
