package com.javarush.task.task33.task3309;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Triangle {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Подай размер триугольника:");
        int triangleSize = Integer.parseInt(reader.readLine());
        reader.close();
        int tempTriangle = 1;
        for (int i = 0; i < triangleSize; i++, tempTriangle++) {
            for (int j = 0; j < tempTriangle; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }

        //  Триугольник с вершиной внизу
        tempTriangle = triangleSize;
        for (int i = 0; i < triangleSize; i++, tempTriangle--) {
            for (int j = 0; j < tempTriangle; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }

        //  Триугольник с вершиной справа
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