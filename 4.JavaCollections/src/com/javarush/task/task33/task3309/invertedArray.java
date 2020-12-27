package com.javarush.task.task33.task3309;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * This function get array size and get strings for fill the array; show all elements in array; invert array and again show array
 */
public class invertedArray {

    /**
     * Start
     *
     * @throws IOException
     */
    public void start() throws IOException {
        String[] array = initArray();
        showAllElementsOfArray(array);
        invertArray(array);
        System.out.println("ось реверснутий масив: ");
        showAllElementsOfArray(array);

    }

    /**
     * Just scanner
     *
     * @return
     * @throws IOException
     */
    private String scanner() throws IOException {
        return new BufferedReader(new InputStreamReader(System.in)).readLine();
    }

    /**
     * This function get size of array from User and fill that array
     *
     * @return
     * @throws IOException
     */
    private String[] initArray() throws IOException {
        String[] array = new String[Integer.parseInt(scanner())];
        for (int i = 0; i < array.length; i++) {
            array[i] = scanner();
        }
        return array;
    }

    /**
     * This function show all elements array of Strings
     *
     * @param arr
     */
    private void showAllElementsOfArray(String[] arr) {
        for (String s : arr) {
            System.out.println(s);
        }
    }

    /**
     * This function invert array of String
     *
     * @param array
     */
    private void invertArray(String[] array) {
        for (int i = 0; i < array.length / 2; i++) {
            String tmp = array[i];
            array[i] = array[array.length - i - 1];
            array[array.length - i - 1] = tmp;
        }
    }
}
