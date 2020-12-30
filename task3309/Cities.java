package com.javarush.task.task33.task3309;

/**
 * Пололучить 10 названий городов
 * положить в массив
 * получить в переменную имя родного города
 * проверить массив на наличие имени родного города
 * ответить знаем или нет
 */
public class Cities {
    private final MyPrinter myPrinter;
    private final MyScanner myScanner;
    private String message;
    private String[] cities;
    private String nativeCity;

    /**
     * Constructor
     */
    Cities() {
        myPrinter = new MyPrinter();
        myScanner = new MyScanner();
    }

    /**
     * Start
     */
    public void start() {
        getCities();
        nativeCity = getNativeCity();
        message = searchInAvailable();
        printer(message);
    }

    /**
     * Get 10 names of cities and add them in array
     */
    private void getCities() {
        int countOfCities = 10;
        cities = new String[countOfCities];
        for (int i = countOfCities-1; i >= 0; i--) {
            message = "Введите " + (i+1) + " названий городов";
            printer(message);
            cities[i] = scanner();
        }
    }

    /**
     * Search name of native city in array names and return answer know or dont
     * @return String
     */
    private String searchInAvailable() {
        for (String s : cities) {
            if (s.equals(nativeCity)) {
                return "я знаю твой город";
            }
        }
            return "я не знаю твой город";
    }

    /**
     * Get name of native cities
     * @return String
     */
    private String getNativeCity() {
        message = "Название родного города";
        printer(message);
        return scanner();
    }


    /**
     * Get som value from console
     *
     * @return int
     */
    private String scanner() {
        return myScanner.readString();
    }

    /**
     * Print on the screen
     *
     * @param s String
     */
    private void printer(String s) {
        myPrinter.print(s);
    }
}
