package com.javarush.task.task33.task3309;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * My custom read from console
 */
public class MyScanner implements MyInterfaceScanner {
    private final BufferedReader reader;

    /**
     * Constructor
     */
    public MyScanner() {
        reader = new BufferedReader(new InputStreamReader(System.in));
    }

    /**
     * Read and return String
     *
     * @return String
     */
    @Override
    public String readString() {
        String s;
        try {
            s = reader.readLine();
        } catch (IOException e) {
            s = e.toString();
        }
        return s;
    }

    /**
     * Read and return Int
     *
     * @return int
     */
    @Override
    public int readInt() {
        int i = 0;
        try {
            i = Integer.parseInt(reader.readLine());
        } catch (IOException e) {
            System.out.println(e.toString());
        }
        return i;
    }

    /**
     * Read and return double
     *
     * @return double
     */
    @Override
    public double readDouble() {
        double d = 0;
        try {
            d = Double.parseDouble(reader.readLine());
        } catch (IOException e) {
            System.out.println(e.toString());
        }
        return d;
    }

    /**
     * Close input stream
     */
    @Override
    public void close() {
        try {
            reader.close();
        } catch (IOException e) {
            System.out.println(e.toString());
        }
    }
}