package com.javarush.task.task33.task3309;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class AskSomeDigit {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("эй, введи число:");
        System.out.println("молодец! на еденицу больше будет " + (Integer.parseInt(reader.readLine()) + 1));
        reader.close();
    }
}


//    Solution for JS
//            let digitFromUser = +prompt('эй, введи число:');
//            console.put('молодец! на еденицу больше будет ');
//            console.log(digitFromUser+1);