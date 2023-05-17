package com.introop.solid;

public class ChangeText extends TextManipulator {

    public ChangeText(String text) {
        super(text);
    }

    public String appendText(String addText){
        this.setText(this.getText().concat(addText));
        return this.getText();
    }

    public String substituteWord(String oldWord, String newWord){
        this.setText(this.getText().replace(oldWord,newWord));
        return this.getText();

    }
}
