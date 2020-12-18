package com.javarush.task.task33.task3309;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Elevator {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("На какой этаж желаете поехать?");
        int floorFromUser = Integer.parseInt(reader.readLine());
        if (floorFromUser < 1 || floorFromUser > 9) {
            System.out.println("неправильный этаж");
        } else {
            if (floorFromUser >= 4 && floorFromUser <= 6) {
                System.out.println("введите пароль:");
                if (Integer.parseInt(reader.readLine()) == 1337) {
                    System.out.println("ok");
                } else {
                    System.out.println("неверный пароль");
                }
            }
        }
    }
}

//    Solution for JS
//
//    let floorFromUser = +prompt('На какой этаж желаете поехать?');
//    if (floorFromUser < 1 || floorFromUser > 9) {
//        console.log('неправильный этаж');
//    } else {
//            if (floorFromUser >= 4 && floorFromUser <= 6) {
//                if (+prompt('введите пароль:') == 1337) {
//                    console.log("ok");
//                } else {
//                console.log('неверный пароль');
//                }
//            }
//    }