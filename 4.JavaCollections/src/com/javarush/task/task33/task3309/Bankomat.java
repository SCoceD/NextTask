package com.javarush.task.task33.task3309;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

/**
 * This is a class simulate "cash deposit Machine"
 */
public class Bankomat {
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    int[] cards = new int[10];

    /**
     * Start this function
     *
     * @throws Exception
     */
    public void start() throws Exception {
        cards[getCardNumber()] = sumForDeposit();
        showBalanceAllCards();
        showSumOnAllCard();
        reader.close();
    }

    /**
     * This function get card number (0 -10) from User for deposit cash
     *
     * @return int
     * @throws Exception
     */
    private int getCardNumber() throws Exception {
        int cardNumber;

        while (true) {
            System.out.println("vvedi nomer kartochki:");
            cardNumber = Integer.parseInt(reader.readLine());
            if (cardNumber >= 0 && cardNumber < 10) {
                break;
            }
        }
        return cardNumber;
    }

    /**
     * This function get cash from User
     *
     * @return int
     * @throws Exception
     */
    private int sumForDeposit() throws Exception {
        int amount;
        while (true) {
            System.out.println("skolko polozhit?");
            amount = Integer.parseInt(reader.readLine());
            if (amount >= -1000 && amount <= 1000) {
                return amount;
            }
        }
    }

    /**
     * This function show on a screen ballans on all card
     */
    private void showBalanceAllCards() {
        for (int c : cards) {
            System.out.print(c + " ");
        }
    }

    private void showSumOnAllCard() {
        System.out.println("\nv summe na vseh kartah " + Arrays.stream(cards).sum());
    }
}

//      Solution of JS

//        let cardNumber;
//        let amount;
//        let cards = [0,0,0,0,0,0,0,0,0,0];
//        while (true) {
//            cardNumber = +prompt('vvedi nomer kartochki:');
//            if(cardNumber >=0 && cardNumber < 10){
//                break;
//            }
//        }
//        while (true) {
//            amount = +prompt('skolko polozhit?')
//            if (amount >= -1000 && amount <= 1000){
//                cards[cardNumber] = amount;
//                break;
//            }
//        }
//        for (let c of cards){
//            console.put(c + " ");
//        }
//        console.put('\nv summe na vseh kartah ' + cards.reduce((a , b) => a+b, 0))