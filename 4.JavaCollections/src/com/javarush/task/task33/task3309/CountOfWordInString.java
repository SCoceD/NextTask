package com.javarush.task.task33.task3309;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class CountOfWordInString {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] words = reader.readLine().replaceAll("[^A-Za-z]" , " ").split(" ");
        List list = new ArrayList();
        for (String s : words){
            if (!s.equals("")){
                list.add(s);
            }
        }
        System.out.println(list.size());
        reader.close();
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