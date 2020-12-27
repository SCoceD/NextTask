package com.javarush.task.task33.task3309;

/**
 * This function sorts arr. Sorts so that the first half of the arrays is odd ascending and the second half is even ascending
 */
public class SortedArrays {
    /**
     * Start
     */
    public void start() {
        int[] arr = new int[]{2, 4, 3, 1, 5, 7, 6, 8, 9, 10};
        sortOdd(arr);
    }

    /**
     * This function sort first half of array odd ascending
     *
     * @param args
     */
    private void sortOdd(int[] args) {
        int[] arr = args;
        for (int i = 0; i < arr.length / 2; i++) {
            for (int j = 0; j < arr.length / 2; j++) {
                if (arr[i] < arr[j]) {
                    if (arr[i] % 2 == 0) {
                        int temp = arr[i];
                        arr[i] = arr[arr.length / 2 + i];
                        arr[arr.length / 2 + i] = temp;
                        break;
                    }
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        sortEven(arr);
    }

    /**
     * This function sort second half of array odd ascending
     *
     * @param args
     */
    private void sortEven(int[] args) {
        int[] arr = args;
        for (int i = arr.length / 2; i < arr.length; i++) {
            for (int j = arr.length / 2; j < arr.length; j++) {
                if (arr[i] < arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        printOnScreen(arr);
    }

    /**
     * This function print on the screen array of Integer
     *
     * @param args
     */
    private void printOnScreen(int[] args) {
        for (int i : args) {
            System.out.println(i);
        }
    }
}
