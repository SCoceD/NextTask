package com.javarush.task.task33.task3309;

import java.util.Arrays;
import java.util.List;

/**
 * This function counts sheeps(true - present, false - is absent) in array
 */
public class ArrayOfSheeps {
    /**
     * Start
     */
    public void start() {
        System.out.println(sheepsCounter(Arrays.asList(true, true, true, false,
                true, true, true, true,
                true, false, true, false,
                true, false, false, true,
                true, true, true, true,
                false, false, true, true)));
    }

    /**
     * This is a sheeps counter
     * @param list
     * @return
     */
    private int sheepsCounter(List list) {
        int i = 0;
        for (Object o : list) {
            if (o.toString().contains("true")) {
                i++;
            }
        }
        return i;
    }
}
