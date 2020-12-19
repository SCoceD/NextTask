package com.javarush.task.task33.task3309;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BiggestWordInLine {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] words = reader.readLine().replaceAll("[^A-Za-z]" , " ").split(" ");
        reader.close();
        String lengthOfWord = "";
        for (String s : words) {
            if (s.length() > lengthOfWord.length()){
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