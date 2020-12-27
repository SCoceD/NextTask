package com.javarush.task.task33.task3309;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * This function get numbers from User until User enters (zero), and show on the screen biggest even number
 */
public class BiggestDigit {
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    /**
     * Start this function
     *
     * @throws IOException
     */
    public void start() throws IOException {
        int biggestDigit = 0;
        int tempNumberFromUser;

        do {
            tempNumberFromUser = getNumberFromUser();
            biggestDigit = equalsDigit(biggestDigit, tempNumberFromUser);
        } while (tempNumberFromUser != 0);

        System.out.println("Biggest number is: " + biggestDigit);
    }

    /**
     * Get number from User and return only even number
     *
     * @return int
     * @throws IOException
     */
    private int getNumberFromUser() throws IOException {
        int tempNumberFromUser;
        do {
            System.out.println("Введите число:");
            tempNumberFromUser = Integer.parseInt(reader.readLine());

        }
        while (tempNumberFromUser % 2 == 1);
        return tempNumberFromUser;
    }

    /**
     * Comparison number and return biggest
     *
     * @param a actually biggest number
     * @param b new number from User
     * @return
     * @throws IOException
     */
    private int equalsDigit(int a, int b) throws IOException {
        return a < b ? b : a;
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