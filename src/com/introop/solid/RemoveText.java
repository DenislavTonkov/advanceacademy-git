package com.introop.solid;

public class RemoveText extends TextManipulator {

    public RemoveText(String text) {
        super(text);
    }

    public String removeWord(String wordToRemove){
        this.setText(this.getText().replace(wordToRemove, ""));
        return this.getText();
    }

    public String deleteText(){
        this.setText("");
        return this.getText();
    }
}
