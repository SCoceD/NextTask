package com.javarush.task.task33.task3309;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/**
 * This function get from User a few number and paint a middle things on the screen
 */
public class MiddlesThins {
    List<Integer> list = new ArrayList();

    public void start() throws IOException {
        getLevelsFromUser();
        showOnTheScreenMiddleThing();
    }

    /**
     * Just read a number
     *
     * @return
     * @throws IOException
     */
    private int scanner() throws IOException {
        return Integer.parseInt(new BufferedReader(new InputStreamReader(System.in)).readLine());
    }

    /**
     * Get desired number of levels
     *
     * @throws IOException
     */
    private void getLevelsFromUser() throws IOException {
        int nextLevels;
        do {
            nextLevels = scanner();
            if (nextLevels == 0) {
                break;
            } else if (nextLevels % 2 == 0) {
                continue;
            } else {
                list.add(nextLevels);
            }
        } while (list.size() <= 20);
    }

    /**
     * This function search biggest level and get from this a width of field for middle things
     *
     * @return
     */
    private int searchMiddle() {
        int midOfThins = list.get(0);
        for (int i : list) {
            if (i > midOfThins) {
                midOfThins = i;
            }
        }
        return midOfThins + 1;
    }

    /**
     * This function paint a middle thing in the screen
     */
    private void showOnTheScreenMiddleThing() {
        int middleOfThings = searchMiddle();
        for (int i : list) {
            for (int j = 0; j < middleOfThings; j++) {
                if (j > (middleOfThings - i) / 2 && j < middleOfThings - ((middleOfThings - i - 1) / 2)) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println("");
        }
    }
}


//      Solution for JS

//        let list = [];
//        while (true){
//            let newValueToArr = +prompt();
//            if (newValueToArr == 0 || list.size == 20){
//                break;
//            }else if (
//                newValueToArr % 2 == 0){
//                continue;
//            }
//            list.push(newValueToArr);
//        }
//        let midlOfThins = list[0];
//        for (let i of list) {
//            if (i > midlOfThins) {
//            midlOfThins = i;
//            }
//        }
//        midlOfThins++;
//        for (let i of list) {
//            for (let j = 0; j < midlOfThins; j++) {
//                if (j > (midlOfThins-i)/2 && j < midlOfThins-((midlOfThins-i-1)/2)){
//                console.put("*");
//                }else{
//                console.put(" ");
//                }
//            }
//        console.log("");
//        }