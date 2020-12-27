package com.javarush.task.task33.task3309;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * This function assesses whether a person fulfills the walking norm
 */
public class KMPerDay {
    /**
     * start
     *
     * @throws IOException
     */
    public void start() throws IOException {
        estimateSuccess();
    }

    /**
     * Just read a number
     *
     * @return int
     * @throws IOException
     */
    private int scanner() throws IOException {
        return Integer.parseInt(new BufferedReader(new InputStreamReader(System.in)).readLine());
    }

    /**
     * Get count of KM from User
     *
     * @return int
     * @throws IOException
     */
    private int getKMFromUser() throws IOException {
        System.out.println("Сколько КМ в день Ты проходишь?");
        return scanner();
    }

    /**
     * Assessment of fulfillment of the norm and print on a screen little or a lot
     *
     * @throws IOException
     */
    private void estimateSuccess() throws IOException {
        if (getKMFromUser() <= 3) {
            System.out.println("мало");
        } else {
            System.out.println("красвчик");
        }
    }
}


//    Solution for JS
//        let KMinDay = +prompt('Сколько КМ в день Ты проходишь?');
//        if (KMinDay <= 3) {
//            console.put('мало');
//        } else if (KMinDay >= 4) {
//            console.put('красавчик');
//        }