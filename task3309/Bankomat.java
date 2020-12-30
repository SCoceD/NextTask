package com.javarush.task.task33.task3309;

import java.util.Arrays;
import java.util.stream.IntStream;

/**
 * Создать и инициализировать массив из 10 чисел
 * спросить номер карточки
 * и присвоить в переменную
 * спросить сколько положить
 * присвоить указаное количество в масив в еомер карточки
 * посчитать суму всех елементов в масиве
 * показать суму всех елементов в масиве
 */
public class Bankomat {
    private final MyScanner myScanner;
    private final MyPrinter myPrinter;
    private final int[] cards;
    private String message;
    private int cardNumber;

    /**
     *
     * Constructor
     */
    Bankomat() {
        myScanner = new MyScanner();
        myPrinter = new MyPrinter();
        int cardsSize = 10;
        cards = new int[cardsSize];
        message = "Введите номер карточки";
    }

    /**
     * Start
     */
    public void start() {
        initCards();
        getCardNumber();
        putOnTheCard();
        showBalanceOnTheAllCards();
        sumBalanceObAllCards();
    }

    /**
     * Show on the screen sum of balance on all cards
     */
    private void sumBalanceObAllCards() {
        message = "В сумме на всех картах ";
        int sumOfBalances = IntStream.of(cards).sum();
        printer(message + sumOfBalances);
    }

    /**
     * Show on the screen on every next card
     */
    private void showBalanceOnTheAllCards() {
        for (int i : cards) {
            printer(i);
        }
    }

    /**
     * Put Sum from the User on his card
     */
    private void putOnTheCard() {
        message = "сколько положить";
        printer("asd");
        System.out.println(message);
        cards[cardNumber] = scanner();
    }

    /**
     * Initialize array of cards
     */
    private void initCards() {
        Arrays.fill(cards, 0);
    }

    /**
     * Get and initialize card number from the User
     */
    private void getCardNumber() {
        printer(message);
        cardNumber = scanner();
    }

    /**
     * Get som value from console
     *
     * @return int
     */
    private int scanner() {
        return myScanner.readInt();
    }

    /**
     * Print on the screen
     *
     * @param s String
     */
    private void printer(String s) {
        myPrinter.print(s);
    }

    /**
     * Print int on the screen
     */
    private void printer(int i) {
        myPrinter.printInLine(i);
    }
}
