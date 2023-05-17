package com.introop.solid;

public class PrintText extends TextManipulator {
    public PrintText(String text) {
        super(text);
    }

    public void printText(){
        System.out.println(this.getText());
    }

    public void printSubStringText(int startIndex, int endIndex){
        System.out.println(this.getText().substring(startIndex, endIndex));
    }
}
