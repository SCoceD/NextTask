package com.javarush.task.task33.task3309;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * This method simulate communication panel in elevator
 */
public class Elevator {
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    int currentFloor;

    /**
     * Start
     *
     * @throws Exception
     */
    public void start() throws Exception {
        requiredFloor();
        System.out.println("exit");

    }

    /**
     * Just BufferedReader
     *
     * @return int
     * @throws Exception
     */
    private int skaner() throws Exception {
        return Integer.parseInt(reader.readLine());
    }

    /**
     * Get floor from User and check this information for validation or security request
     *
     * @return
     * @throws Exception
     */
    private int requiredFloor() throws Exception {
        int floor;
        do {
            System.out.println("На какой этаж желаете поехать?");
            floor = skaner();
            if (floor == 0) {
                return 0;
            } else if (floor == currentFloor) {
                System.out.println("вы уже на " + currentFloor + "м этаже.");
            } else if (floor < 0 || floor > 9) {
                System.out.println("неправильный этаж");
            } else if (floor >= 4 && floor <= 6) {
                if (getPass()) {
                    System.out.println("ok");
                    currentFloor = floor;
                } else {
                    System.out.println("неверный пароль");
                }
            }
            currentFloor = floor;
        } while (floor < 0 || floor > 9 || floor != 0);
        return floor;
    }

    /**
     * Get password from User and check for validation
     *
     * @return
     * @throws Exception
     */
    private boolean getPass() throws Exception {
        System.out.println("введите пароль: ");
        int pass = skaner();
        if (pass == 1337) {
            return true;
        }
        return false;
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