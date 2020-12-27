package com.javarush.task.task33.task3309;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * This function get two number from User and return his sum
 */
public class AskTwoDigitAndShowIthSumm {
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    /**
     * Start this function
     *
     * @throws IOException
     */
    public void start() throws IOException {
        System.out.println("в суме: " + getSum());
        reader.close();
    }

    /**
     * This function call next function for get number and add up these number and return
     *
     * @return int
     * @throws IOException
     */
    private int getSum() throws IOException {
        return getFirstńumber() + getSecondNumber();
    }

    /**
     * Get first number from User and return
     *
     * @return int
     * @throws IOException
     */
    private int getFirstńumber() throws IOException {
        System.out.println("эй, введи первое число:");
        return Integer.parseInt(reader.readLine());
    }

    /**
     * Get second number from User and return
     *
     * @return int
     * @throws IOException
     */
    private int getSecondNumber() throws IOException {
        System.out.println("эй, введи второе число:");
        return Integer.parseInt(reader.readLine());
    }
}


//    Solution for JS
//            let firstUsersDigit = +prompt('эй, введи первое число:');
//            let secondUsersDigit = +prompt('эй, введи второе число:');
//            console.put("молодец! " + firstUsersDigit + "+" + secondUsersDigit + "=" + (firstUsersDigit+secondUsersDigit));

