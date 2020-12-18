package com.javarush.task.task33.task3309;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class AboutDigitOnScreen {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int countFromUser = Integer.parseInt(reader.readLine());
        for (int i = 1; i <= countFromUser; i++) {
            System.out.println(i);
        }
        System.out.println(" ");
        for (int i = countFromUser; i >= 1; i--) {
            System.out.println(i);
        }
        // Вывести только четные
        System.out.println(" ");
        for (int i = 2; i < countFromUser; i+=2) {
            System.out.println(i);
        }
        System.out.println(" ");
        // Вывести только четные через while
        int i = 2;
        while (i <= countFromUser) {
            System.out.println(i);
            i+=2;
        }
    }
}


//      Solution for JS
//
//      let countFromUser = +prompt();
//      for (let i = 1; i <= countFromUser; i++) {
//          console.log(i);
//      }
//      console.log("");

//      for (let i = countFromUser; i >= 1; i--) {
//          console.log(i);
//      }
//      console.log("");

//      // Вывести только четные
//      for (let i = 2; i < countFromUser; i+=2) {
//      console.log(i);
//      }
//      console.log("");

//      // Вывести только четные через while
//      let i = 2;
//      while (i <= countFromUser) {
//      console.log(i);
//      i+=2;
//      }