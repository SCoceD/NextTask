package com.javarush.task.task33.task3309;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ChristmassTree {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(reader.readLine());
        reader.close();
        String s = "*";
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
}
