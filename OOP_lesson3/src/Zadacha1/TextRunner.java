package Zadacha1;

/**
 * Created by Andrey on 22.07.2016.
 */
public class TextRunner {


    public static void main(String[] args) {
       //Title
        Word word = new Word();
        Sentence sentence = new Sentence();
        word.setWord("Headline");
        sentence.addWord(word.getWord());
        word.setWord("is");
        sentence.addWord(word.getWord());
        word.setWord("good");
        sentence.addWord(word.getWord());
        Text text = new Text();
        text.setTextTitle(sentence.sentenceToString());
        //Text
        sentence = new Sentence();
        word.setWord("The");
        sentence.addWord(word.getWord());
        word.setWord("great");
        sentence.addWord(word.getWord());
        word.setWord("text!");
        sentence.addWord(word.getWord());
        text.setText(sentence.sentenceToString());
        //display methods
        text.displayTextTitle();
        text.displayText();
        //Add word to the text
        text.addText(" Hello");
        text.displayText();

    }


}
