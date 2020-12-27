package com.javarush.task.task33.task3309;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * This function asks User for the size of the square and print square on the screen
 */
public class Square {
    int squareSize;

    /**
     * Start
     *
     * @throws IOException
     */
    public void start() throws IOException {
        getSizeFromUser();
        printSquare();
    }

    /**
     * Get size of square from User
     *
     * @throws IOException
     */
    private void getSizeFromUser() throws IOException {
        System.out.println("Задай размер квадрата:");
        squareSize = Integer.parseInt(new BufferedReader(new InputStreamReader(System.in)).readLine());
    }

    /**
     * Print square of the asterisks on the screen
     */
    private void printSquare() {
        for (int i = 0; i < squareSize; i++) {
            for (int j = 0; j < squareSize; j++) {
                printAsterisk();
            }
            System.out.println("");
        }
    }

    /**
     * Print one asterisk on the screen
     */
    private void printAsterisk() {
        System.out.print("*");
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