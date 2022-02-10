package io.turntabl.principles.SPA.TextManipulation;

public class TextManipulator {
    private String text;

    public TextManipulator(String text){
        this.text = text;
    }

    //todo: return text.
    public String getText(){
        return text;
    }

    //todo: append new text to existing text.
    public void appendText(String newText){
        text = text.concat(newText);
    }

    //todo: find a word within the text and replace it with the new word.
    public String findWordAndReplace(String word, String replacementWord) {
        if (text.contains(word)) {
            text = text.replace(word, replacementWord);
        }
        return text;
    }

    //todo: find a word within the text and delete it.
    public String findWordAndDelete(String word) {
        if (text.contains(word)) {
            text = text.replace(word, "");
        }
        return text;
    }

    //todo: print out the text. --VIOLATION--
    public void printText() {
        System.out.println(this.getText());
    }

    /*todo: This class has two different responsibilities.
        1.  Methods for manipulating text
        2.  A method for printing out text
       The class therefore violates the single responsibility rule. To correct
       this violation, we will create a class to handle the printing of text.
     */
}
