package com.javarush.task.task33.task3309;

/**
 * My custom method print on the screen
 */
public class MyPrinter implements MyPrinterInterface {
    /**
     * Default constructor
     */
    public MyPrinter() {
    }

    /**
     * Print string in one line(without /n) on the screen
     * @param s String
     */
    @Override
    public void printInLine(String s) {
        System.out.print(s);
    }

    /**
     * Print String on the screen
     * @param s String
     */
    @Override
    public void print(String s) {
        System.out.println(s);
    }
}
