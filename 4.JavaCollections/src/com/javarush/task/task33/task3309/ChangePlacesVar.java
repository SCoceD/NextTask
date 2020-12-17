package com.javarush.task.task33.task3309;

import java.io.IOException;

public class ChangePlacesVar {
    public static void main(String[] args) throws IOException {
        int a = 10;
        int b = 100;
        a += b;
        b = a - b;
        a -= b;
        System.out.print("a = " + a + " b = " + b);
    }
}
