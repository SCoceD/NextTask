package com.javarush.task.task33.task3309;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class KMPerDay {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Сколько КМ в день Ты проходишь?");
        int KMinDay = Integer.parseInt(reader.readLine());
        if (KMinDay <= 3) {
            System.out.println("мало");
        } else if (KMinDay >= 4) {
            System.out.println("красавчик");
        }
    }
}


//    Solution for JS
//        let KMinDay = +prompt('Сколько КМ в день Ты проходишь?');
//        if (KMinDay <= 3) {
//            console.put('мало');
//        } else if (KMinDay >= 4) {
//            console.put('красавчик');
//        }