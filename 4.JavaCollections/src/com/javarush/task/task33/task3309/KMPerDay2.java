package com.javarush.task.task33.task3309;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * This function assesses whether a person fulfills the walking norm
 */
public class KMPerDay2 {
    public void start() throws Exception {
        evaluateSuccess();
    }

    /**
     * Just read a number
     *
     * @return int
     * @throws IOException
     */
    private int scanner() throws Exception {
        return Integer.parseInt(new BufferedReader(new InputStreamReader(System.in)).readLine());
    }

    /**
     * Get count of KM from User
     *
     * @return int
     * @throws IOException
     */
    private int getKMFromUser() throws Exception {
        System.out.println("Сколько КМ в день Ты проходишь?");
        return scanner();
    }

    /**
     * Assessment of fulfillment of the norm and print on a screen little or a lot
     *
     * @throws IOException
     */
    private void evaluateSuccess() throws Exception {
        int KMinDay = getKMFromUser();
        if (KMinDay <= 3) {
            System.out.println("мало");
        } else if (KMinDay >= 4 && KMinDay < 20) {
            System.out.println("красавчик");
        } else if (KMinDay >= 20) {
            System.out.println("марафонець!!");
        }
    }
}

//    Solution for JS
//
//    let KMinDay = +prompt('Сколько КМ в день Ты проходишь?');
//        if (KMinDay <= 3) {
//            console.put('мало');
//        } else if (KMinDay >= 4 && KMinDay < 20) {
//            console.put('красавчик');
//        } else if (KMinDay >= 20) {
//            console.put('марафонець!!');
//        }