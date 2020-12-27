package com.javarush.task.task33.task3309;

/**
 * This function print in the screen 'Hello World!' and sum from 12892323+454665768
 */
public class HelloWorld {
    /**
     * This is a start
     */
    public void start() {
        printHelloWorld();
        printSumFromSomeNumber();
    }

    /**
     * This function print 'Hello World!' on the screen
     */
    private void printHelloWorld() {
        System.out.println("Hello World!");
    }

    /**
     * This function print sum on the screen from '12892323+454665768'
     */
    private void printSumFromSomeNumber() {
        System.out.println(12892323 + 454665768);
    }
}

//    Solution for JS
//
//        console.log('Hello world');
//
//        console.log(12892323+454665768);