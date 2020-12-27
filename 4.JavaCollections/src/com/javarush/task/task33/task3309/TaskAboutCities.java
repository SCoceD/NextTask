package com.javarush.task.task33.task3309;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * This function get from User ten names of cities and ask about native city of User, if native cities was be enter earlier
 * function print on the screen information that this city knows, or dont know if native city newer entered before
 */
public class TaskAboutCities {
    private String[] Cities;
    private String nativeCity;

    /**
     * Start
     *
     * @throws IOException
     */
    public void start() throws IOException {
        initCitiesArr();
        initNativeCities();
        searchInArr();
    }

    /**
     * Just Scanner
     *
     * @return
     * @throws IOException
     */
    private String scanner() throws IOException {
        return new BufferedReader(new InputStreamReader(System.in)).readLine();
    }

    /**
     * This function asks to enter 10 city names add it to array
     *
     * @throws IOException
     */
    private void initCitiesArr() throws IOException {
        System.out.println("Введите 10 названий городов:");

        Cities = new String[10];
        for (int i = 0; i <
                Cities.length; i++) {

            Cities[i] = scanner();
        }
    }

    /**
     * This function asks about native cities and initialize variable nativeCity
     *
     * @throws IOException
     */
    private void initNativeCities() throws IOException {
        System.out.println("Введите название родного города:");
        nativeCity = scanner();
    }

    /**
     * Search in array is there a nativeCity and say about result
     */
    private void searchInArr() {
        for (int i = 0; i <
                Cities.length; i++) {
            if (
                    Cities[i].equals(nativeCity)) {
                System.out.println("я знаю твой город");
                break;
            }
            if (i ==
                    Cities.length - 1) {
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