package com.javarush.task.task33.task3309;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ChristmasTree {
    public void start() throws IOException {
        String s = "*";
        int a = getHeightOfChristmasTrees();
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < a * 2; j++) {
                if (j == a - s.length() / 2) {
                    System.out.print(s);
                    s += "**";
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        for (int i = 0; i < a; i++) {
            System.out.print(" ");
        }
        System.out.print("*");
    }

    private int getHeightOfChristmasTrees() throws IOException {
        return Integer.parseInt(new BufferedReader(new InputStreamReader(System.in)).readLine());
    }
}
