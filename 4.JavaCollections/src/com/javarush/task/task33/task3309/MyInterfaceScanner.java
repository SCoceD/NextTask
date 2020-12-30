package com.javarush.task.task33.task3309;

/**
 * My custom interface for reader
 */
public interface MyInterfaceScanner {
    /**
     * Read and return String from console
     * @return
     */
    String readString();

    /**
     * Read and return Integer from console
     * @return
     */
    int readInt();

    /**
     * Read and return Double from console
     * @return
     */
    double readDouble();

    /**
     * Close the input stream
     */
    void close();
}
