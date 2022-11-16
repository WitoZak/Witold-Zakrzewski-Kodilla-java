package com.kodilla.stream.beautifier;

public class PoemBeautifier {
    public void beautify(String wordsToBeautify, PoemDecorator poemdecorator) {
        System.out.println(poemdecorator.decorate(wordsToBeautify));
    }
}