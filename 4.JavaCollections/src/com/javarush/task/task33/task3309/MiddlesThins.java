package com.javarush.task.task33.task3309;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class MiddlesThins {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        List<Integer> list = new ArrayList();
        while (true){
            int newValueToArr = Integer.parseInt(reader.readLine());
            if (newValueToArr == 0 || list.size() == 20){
                break;
            }else if (newValueToArr % 2 == 0){
                continue;
            }
            list.add(newValueToArr);
        }
        reader.readLine();
        int midlOfThins = list.get(0);
        for (int i : list) {
            if (i > midlOfThins) {
                midlOfThins = i;
            }
        }
        midlOfThins++;
        for (int i : list) {
            for (int j = 0; j < midlOfThins; j++) {
                if (j > (midlOfThins-i)/2 && j < midlOfThins-((midlOfThins-i-1)/2)){
                    System.out.print("*");
                }else{
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