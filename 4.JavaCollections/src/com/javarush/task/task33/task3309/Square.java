package com.javarush.task.task33.task3309;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Square {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Задай размер квадрата:");
        int squareSize = Integer.parseInt(reader.readLine());
        reader.close();
        for (int i = 0; i < squareSize; i++) {
            for (int j = 0; j < squareSize; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }

        // Теперь через while

        int i = 0;
        while (i < squareSize) {
            int j = 0;
            while (j < squareSize) {
                System.out.print("*");
                j++;
            }
            System.out.println("");
            i++;
        }
    }
}


//      Solution for JS

//        let squareSize = +prompt('Задай размер квадрата:');
//        for (let i = 0; i < squareSize; i++) {
//            for (let j = 0; j < squareSize; j++) {
//            console.put("*");
//            }
//        console.log("");
//        }
//
//        // Теперь через while
//
//        let i = 0;
//        while (i < squareSize) {
//            let j = 0;
//            while (j < squareSize) {
//            console.put("*");
//            }
//        console.log("");
//        i++;
//        }