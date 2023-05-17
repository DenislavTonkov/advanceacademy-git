package com.introop.solid;

public class TextManipulator {
    private String text;
//    private String replacement;

    public TextManipulator(String text){
        this.text = text;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}
