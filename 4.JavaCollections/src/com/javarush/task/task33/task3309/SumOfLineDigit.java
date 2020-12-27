package com.javarush.task.task33.task3309;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * This function counts the sum of a series of numbers
 */
public class SumOfLineDigit {
    /**
     * Start
     *
     * @throws IOException
     */
    public void start() throws IOException {
        System.out.println(getSumOfLineNumber(getStartNumberFromUser(), getLastNumberFromUser()));
    }

    /**
     * Get start number for series of number
     *
     * @return int
     * @throws IOException
     */
    private int getStartNumberFromUser() throws IOException {
        System.out.println("Введите стартовое число");
        return Integer.parseInt(new BufferedReader(new InputStreamReader(System.in)).readLine());
    }

    /**
     * Get last number for series of number
     *
     * @return int
     * @throws IOException
     */
    private int getLastNumberFromUser() throws IOException {
        System.out.println("Введмте последнее число");
        return Integer.parseInt(new BufferedReader(new InputStreamReader(System.in)).readLine());
    }

    /**
     * Counts the sum of a series of numbers
     *
     * @param startNumberFromUser
     * @param endNumberFromUser
     * @return
     * @throws IOException
     */
    private int getSumOfLineNumber(int startNumberFromUser, int endNumberFromUser) throws IOException {
        int result = 0;
        for (int i = startNumberFromUser; i <= endNumberFromUser; i++) {
            result += i;
        }
        return result;
    }
}

//      Solution for JS

//    let start = +prompt('Введите стартовое число:');
//    let last = +prompt('Введмте последнее число:')
//    for (let i = start+1; i <= last; i++) {
//        start += i;
//    }
//    console.log(start);