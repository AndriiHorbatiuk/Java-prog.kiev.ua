package Zadacha1;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Andrey on 22.07.2016.
 */
public class Sentence {

    private List<String> sentence = new ArrayList<>();

    public List<String> getSentence() {
        return sentence;
    }

    public void setSentence(List<String> sentence) {
        this.sentence = sentence;
    }

    public void addWordToSentence(String word){
        sentence.add(word);
    }
}
