package com.javarush.task.task33.task3309;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Take String from User and return longest word in this String
 */
public class BiggestWordInLine {
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    /**
     * Start
     *
     * @throws IOException
     */
    public void start() throws IOException {
        deleteAllEmptyString();
        reader.close();
    }

    /**
     * This function delete all no letter character from String
     *
     * @return String
     * @throws IOException
     */
    private String deleteAllNoLetter() throws IOException {
        return getStringFromUser().replaceAll("[^A-Za-z]", " ");
    }

    /**
     * This function get String from User
     *
     * @return String
     * @throws IOException
     */
    private String getStringFromUser() throws IOException {
        System.out.println("Give me a String:");
        return reader.readLine();
    }

    /**
     * This function separate String in to an array of words
     *
     * @return
     * @throws IOException
     */
    private String[] getArrFromStirng() throws IOException {
        return deleteAllNoLetter().split(" ");
    }

    /**
     * This function delete all empty String from array of Strings
     *
     * @throws IOException
     */
    private void deleteAllEmptyString() throws IOException {
        String lengthOfWord = "";
        for (String s : getArrFromStirng()) {
            if (s.length() > lengthOfWord.length()) {
                lengthOfWord = s;
            }
        }
        System.out.println(lengthOfWord);
    }
}

//      Solution for JS

//        let words = prompt().replace(/[^A-Za-z]/g, ' ');
//        let splitedWords = words.split(' ');
//        let endSplit = [];
//        for(let s of splitedWords){
//            if(s != ''){
//            endSplit.push(s);
//            }
//        }
//        let longWord = "";
//        for(let s of endSplit){
//            if(s.length > longWord.length){
//            longWord = s;
//            }
//        }
//        console.log(longWord);