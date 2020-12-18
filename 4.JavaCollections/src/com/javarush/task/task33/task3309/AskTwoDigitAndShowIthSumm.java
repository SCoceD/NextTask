package com.javarush.task.task33.task3309;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class AskTwoDigitAndShowIthSumm {
    public static void main(String [] args) throws IOException {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("эй, введи первое число:");
            int firstUsersDigit = Integer.parseInt(reader.readLine());
            System.out.println("эй, введи второе число:");
            int secondUsersDigit = Integer.parseInt(reader.readLine());
            System.out.println("молодец! " + firstUsersDigit + "+" + secondUsersDigit + "=" + (firstUsersDigit+secondUsersDigit));
        }
    }


//    Solution for JS
//            let firstUsersDigit = +prompt('эй, введи первое число:');
//            let secondUsersDigit = +prompt('эй, введи второе число:');
//            console.put("молодец! " + firstUsersDigit + "+" + secondUsersDigit + "=" + (firstUsersDigit+secondUsersDigit));

