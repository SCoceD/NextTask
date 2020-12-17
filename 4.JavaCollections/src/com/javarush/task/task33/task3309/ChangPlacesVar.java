package com.javarush.task.task33.task3309;

public class ChangPlacesVar {
    public static void main(String[] args) {
        int a = 10;
        int b = 100;
        a += b;
        b = a - b;
        a = a - b;
        System.out.println(a + " " + b);
    }
}
