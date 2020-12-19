package com.javarush.task.task33.task3309;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SumOfLineDigit {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите стартовое число");
        int start = Integer.parseInt(reader.readLine());
        System.out.println("Введмте последнее число");
        int last = Integer.parseInt(reader.readLine());
        reader.close();
        for (int i = start+1; i <= last; i++) {
            start += i;
        }
        System.out.println(start);
    }
}

//      Solution for JS

//    let start = +prompt('Введите стартовое число:');
//    let last = +prompt('Введмте последнее число:')
//    for (let i = start+1; i <= last; i++) {
//        start += i;
//    }
//    console.log(start);