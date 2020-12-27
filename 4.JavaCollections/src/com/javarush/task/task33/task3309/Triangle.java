package com.javarush.task.task33.task3309;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * This function get size of triangle from User and print on the screen three kind of triangle
 */
public class Triangle {
    int triangleSize;
    int tempTriangle = 1;

    /**
     * Start
     *
     * @throws IOException
     */
    public void start() throws IOException {
        scanner();
        printTriangle();
        printBottomTriangle();
        printTriangleWithApexOnTheRight();
    }

    /**
     * Just scanner
     *
     * @throws IOException
     */
    private void scanner() throws IOException {
        System.out.println("Подай размер триугольника:");
        triangleSize = Integer.parseInt(new BufferedReader(new InputStreamReader(System.in)).readLine());
    }

    /**
     * Print triangle with apex on the top
     */
    private void printTriangle() {
        for (int i = 0; i < triangleSize; i++, tempTriangle++) {
            for (int j = 0; j < tempTriangle; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }

    /**
     * Print triangle with apex on the bottom
     */
    private void printBottomTriangle() {
        tempTriangle = triangleSize;
        for (int i = 0; i < triangleSize; i++, tempTriangle--) {
            for (int j = 0; j < tempTriangle; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }

    /**
     * Print triangle with apex on right bottom
     */
    private void printTriangleWithApexOnTheRight() {
        for (int i = 0; i < triangleSize; i++) {
            tempTriangle = i;
            for (int j = 0; j < triangleSize; j++) {
                if (tempTriangle > 0) {
                    System.out.print(" ");
                    tempTriangle--;
                } else {
                    System.out.print("*");
                }
            }
            System.out.println("");
        }
    }
}


//      Solution for JS

//        let triangleSize = +prompt('Подай размер триугольника:');
//        let tempTriangle = 1;
//        for (let i = 0; i < triangleSize; i++, tempTriangle++) {
//            for (let j = 0; j < tempTriangle; j++) {
//                console.put("*");
//            }
//        console.log("");
//        }
//
//        //  Триугольник с вершиной внизу
//        tempTriangle = triangleSize;
//        for (let i = 0; i < triangleSize; i++, tempTriangle--) {
//            for (let j = 0; j < tempTriangle; j++) {
//            console.put("*");
//            }
//        console.log("");
//        }
//
//        //  Триугольник с вершиной справа
//        for (let i = 0; i < triangleSize; i++) {
//            tempTriangle = i;
//            for (let j = 0; j < triangleSize; j++) {
//                if (tempTriangle > 0) {
//                    console.put(" ");
//                    tempTriangle--;
//                } else {
//                console.put("*");
//                }
//            }
//        console.log("");
//        }