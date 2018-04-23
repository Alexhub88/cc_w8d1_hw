package com.example.alexsword.wordcounter;

import java.util.ArrayList;
import java.util.HashMap;

public class WordCounter {

    private String[] wordList;
    private int wordCount;

    public WordCounter() {
    }

    public int countWords(String inputString){
        wordList = inputString.split(" ");
        wordCount = wordList.length;
        return wordCount;
    }
    
}
