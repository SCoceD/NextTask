package com.javarush.task.task33.task3309;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class KMPerDay2 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Сколько КМ в день Ты проходишь?");
        int KMinDay = Integer.parseInt(reader.readLine());
        if (KMinDay <= 3) {
            System.out.println("мало");
        } else if (KMinDay >= 4 && KMinDay <20) {
            System.out.println("красавчик");
        } else if (KMinDay >=20){
            System.out.println("марафонець!!");
        }
        //что бы без обойтись без логичкского оператора && нужно поменять местами 2й и 3й блоки else if.
    }
}

//    Solution for JS
//
//    let KMinDay = +prompt('Сколько КМ в день Ты проходишь?');
//        if (KMinDay <= 3) {
//            console.put('мало');
//        } else if (KMinDay >= 4 && KMinDay < 20) {
//            console.put('красавчик');
//        } else if (KMinDay >= 20) {
//            console.put('марафонець!!');
//        }