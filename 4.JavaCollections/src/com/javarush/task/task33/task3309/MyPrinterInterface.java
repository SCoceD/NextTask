package com.javarush.task.task33.task3309;

/**
 * My interface for custom printer
 */
public interface MyPrinterInterface {
    /**
     * Print String in one line(without /n) on the screen
     * @param s String
     */
    void printInLine(String s);

    /**
     * Print String on the screen
     * @param s String
     */
    void print(String s);
}