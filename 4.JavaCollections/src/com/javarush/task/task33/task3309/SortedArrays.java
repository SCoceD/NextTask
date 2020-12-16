package com.javarush.task.task33.task3309;
//[1,3,5,7,9,2,4,6,8,10]

public class SortedArrays {
    public static void main(String[] args) {
        int[] arr = new int[]{2, 4, 3, 1, 5, 7, 6, 8, 9, 10};
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
        for (int i = arr.length / 2; i < arr.length; i++) {
            for (int j = arr.length / 2; j < arr.length; j++) {
                if (arr[i] < arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        for (int i : arr) {
            System.out.println(i);
        }
    }
}
