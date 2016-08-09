package Zadacha1;

/**
 * Created by Andrey on 22.07.2016.
 */
public class Text {
    private String textTitle;
    private String text;

    public void displayTextTitle(){
        System.out.println(textTitle);
    }

    public void displayText(){
        System.out.println(text);
    }

    public void addText(String s){
        text = text + s;
    }

    public String getTextTitle() {
        return textTitle;
    }

    public void setTextTitle(String textTitle) {
        this.textTitle = textTitle;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }


}
