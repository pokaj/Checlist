package io.turntabl.principles.SPA.TextManipulation;

import java.util.Arrays;

public class TextPrinter {

    TextManipulator textManipulator;

    public TextPrinter(TextManipulator textManipulator) {
        this.textManipulator = textManipulator;
    }

    //todo: print out the entire text
    public void printText() {
        System.out.println(textManipulator.getText());
    }

    //todo: print out each word in the text in an array.
    public void printOutEachWordOfText() {
        System.out.println(Arrays.toString(textManipulator.getText().split(" ")));
    }

}
