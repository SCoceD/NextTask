package com.javarush.task.task33.task3309;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Bankomat {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int cardNumber;
        int amount;
        int [] cards = new int[10];
        while (true) {
            System.out.println("vvedi nomer kartochki:");
            cardNumber= Integer.parseInt(reader.readLine());
            if(cardNumber >=0 && cardNumber < 10){
                break;
            }
        }
        while (true) {
            System.out.println("skolko polozhit?");
            amount = Integer.parseInt(reader.readLine());
            if (amount >= -1000 && amount <= 1000){
                cards[cardNumber] = amount;
                break;
            }
        }
        for (int c : cards){
            System.out.print(c + " ");
        }
        reader.readLine();
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