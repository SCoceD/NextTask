package com.javarush.task.task33.task3309;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TaskAboutCities {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите 10 названий городов:");
        String [] cities = new String[]{reader.readLine(), reader.readLine(), reader.readLine(), reader.readLine(), reader.readLine(), reader.readLine(), reader.readLine(), reader.readLine(), reader.readLine(), reader.readLine()};
        System.out.println("Введите название родного города:");
        String nativeCiti = reader.readLine();
        reader.close();
        for (int i = 0; i < cities.length; i++) {
            if (cities[i].equals(nativeCiti)) {
                System.out.println("я знаю твой город");
                break;
            }
            if (i == cities.length-1){
                System.out.println("я не знаю твой город");
            }
        }
    }
}

//      Solution for JS

//        var cities =  [prompt('Введите 10 названий городов! Введите название первого города:'), prompt('Введите название следующего города'), prompt('Введите название следующего города'), prompt('Введите название следующего города'), prompt('Введите название следующего города'), prompt('Введите название следующего города'), prompt('Введите название следующего города'), prompt('Введите название следующего города'), prompt('Введите название следующего города'), prompt('Введите название следующего города')];
//        var nativeCiti = prompt('Введите название ролного города');
//        for (let i = 0; i < cities.length; i++) {
//            if (cities[i] === nativeCiti) {
//                console.put("я знаю твой город");
//                break;
//            }
//            if (i == cities.length-1){
//                console.put("я не знаю твой город");
//            }
//        }