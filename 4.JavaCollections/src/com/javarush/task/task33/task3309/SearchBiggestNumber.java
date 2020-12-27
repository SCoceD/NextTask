package com.javarush.task.task33.task3309;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * This function two number and show biggest like Math.max()
 */
public class SearchBiggestNumber {
    /**
     * Start
     * @throws IOException
     */
    public void start() throws IOException {
        int a = scanner();
        int b = scanner();
        System.out.println(max1(a, b));
    }

    /**
     * Get two number and return biggest
     * @param a
     * @param b
     * @return
     */
    private int max1(int a, int b) {
        return a > b ? a : b;
    }

    /**
     * This is just scanner
     * @return
     * @throws IOException
     */
    private int scanner() throws IOException {
        return Integer.parseInt(new BufferedReader(new InputStreamReader(System.in)).readLine());
    }
}
