package com.javarush.task.task33.task3309;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BigestDigit {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите число:");
        int biggestDigit = 0;
        while ((biggestDigit = Integer.parseInt(reader.readLine())) % 2 == 1){
        }
        int tempDigitFromUser;
        while((tempDigitFromUser = Integer.parseInt(reader.readLine())) != 0 && biggestDigit != 0){
            if(biggestDigit < tempDigitFromUser && tempDigitFromUser % 2 == 0){
                biggestDigit = tempDigitFromUser;
            }
        }
        reader.close();
        System.out.println(biggestDigit);
    }
}


//      Solution for JS

//        let biggestDigit;
//        while (biggestDigit = +prompt('Введите число:')  % 2 == 1){
//        }
//        let tempDigitFromUser;
//        while((tempDigitFromUser = +prompt('Введите число:')) !== 0 && biggestDigit !== 0){
//            if(biggestDigit < tempDigitFromUser && tempDigitFromUser % 2 === 0){
//                biggestDigit = tempDigitFromUser;
//            }
//        }
//        console.log(biggestDigit);