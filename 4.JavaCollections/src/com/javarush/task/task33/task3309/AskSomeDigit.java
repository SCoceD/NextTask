package com.javarush.task.task33.task3309;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * This class get a number from User and show on screen this number after increase by 1.
 */
public class AskSomeDigit {
    public void start() throws IOException {
        returnIncreasedDigit();
    }

    /**
     * get a number from User
     *
     * @return int
     * @throws IOException
     */
    private int scanner() throws IOException {
        System.out.println("эй, введи число:");
        int digitFormUser = Integer.parseInt(new BufferedReader(new InputStreamReader(System.in)).readLine());
        return digitFormUser;
    }

    /**
     * Increase number from User by 1 and show it on screen.
     *
     * @throws IOException
     */
    private void returnIncreasedDigit() throws IOException {
        System.out.println("молодец! на еденицу больше будет " + (scanner() + 1));
    }
}


//    Solution for JS
//            let digitFromUser = +prompt('эй, введи число:');
//            console.put('молодец! на еденицу больше будет ');
//            console.log(digitFromUser+1);