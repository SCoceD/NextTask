package com.javarush.task.task33.task3309;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/**
 * This methods get a String from User and return count of words in this String
 */
public class CountOfWordInString {
    public void start() throws IOException {
        System.out.println(getCountOfWord());
    }

    /**
     * Get String from the User
     *
     * @return
     * @throws IOException
     */
    private String getString() throws IOException {
        return new BufferedReader(new InputStreamReader(System.in)).readLine();
    }

    /**
     * This method replace all no letter with spaces, in this String
     *
     * @return
     * @throws IOException
     */
    private String deleteAllNoLetter() throws IOException {
        return getString().replaceAll("[^A-Za-z]", " ");
    }

    /**
     * This function separate String in to an array of words
     *
     * @return
     * @throws IOException
     */
    private String[] stringToArray() throws IOException {
        return deleteAllNoLetter().split(" ");
    }

    /**
     * This function return count of words in array
     *
     * @return
     * @throws IOException
     */
    private int getCountOfWord() throws IOException {
        int countOfWord = 0;
        for (String s : stringToArray()) {
            if (!s.equals("")) {
                countOfWord++;
            }
        }
        return countOfWord;
    }
}

//      Solution for JS

//        let words = prompt().replace(/[^A-Za-z]/g, ' ');
//        let splitedWords = words.split(' ');
//        let endSplit = []
//        for(let s of splitedWords){
//            if(s != ''){
//            endSplit.push(s);
//            }
//        }
//        console.log(endSplit.length);