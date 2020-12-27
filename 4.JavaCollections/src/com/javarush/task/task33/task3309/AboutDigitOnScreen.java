package com.javarush.task.task33.task3309;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * This class take digit from user and show :
 * 1. All number from 0 to number from User;
 * 2. All number from digit from User to 0;
 * 3. ALL even number;
 * 4. All even number whits while loop
 */
public class AboutDigitOnScreen {
    private BufferedReader reader;

    public void start() throws Exception {
        int digitForWork = scaner();
        showAllDigitFromZeroToDigit(digitForWork);
        System.out.println("");
        showAllDigitFromDigitToZero(digitForWork);
        System.out.println("");
        showOnlyEven(digitForWork);
        System.out.println("");
        showOnlyEvenWithWhileLoop(digitForWork);
//        Почему закрытый поток в этом класе вызываает ошибку у класса который должен отработать следующим??? Типа поток
//        закрыт. Но когда тут убираю закрытие потока то все работает???
//        reader.close();
    }

    /**
     * Ask about digit for processing
     *
     * @return int
     * @throws Exception
     */
    private int scaner() throws Exception {
        int countFromUser = Integer.parseInt(Singleton().readLine());
        return countFromUser;
    }

    /**
     * Show in numerical order
     *
     * @return int
     * @throws Exception
     */
    private void showAllDigitFromZeroToDigit(int arg) throws Exception {
        for (int i = 1; i <= arg; i++) {
            System.out.println(i);
        }
    }

    /**
     * Show in reverse numeric order
     *
     * @return int
     * @throws Exception
     */
    private void showAllDigitFromDigitToZero(int arg) throws Exception {
        for (int i = arg; i >= 1; i--) {
            System.out.println(i);
        }
    }

    /**
     * Show only even digit in numerical order
     *
     * @return int
     * @throws Exception
     */
    private void showOnlyEven(int arg) throws Exception {
        for (int i = 2; i < arg; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
    }

    /**
     * Show only even digit in numerical order with while loop
     *
     * @return int
     * @throws Exception
     */
    private void showOnlyEvenWithWhileLoop(int arg) throws Exception {
        int i = 0;
        while (i <= arg) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
            i++;
        }
    }

    /**
     * Singleton
     * Сначало планировал сделать вывод с запросом нового числа для каждого метода, потому создал Сингелтон. Пожже пришел
     * к выводу что он тут ненужен !!!Уточнить у Артёма!!!
     *
     * @return
     */
    private BufferedReader Singleton() {
        if (reader == null) {
            reader = new BufferedReader(new InputStreamReader(System.in));
        }
        return reader;
    }
}