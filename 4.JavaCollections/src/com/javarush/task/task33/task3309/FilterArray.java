package com.javarush.task.task33.task3309;

import java.util.ArrayList;

/**
 * This function get array filter this array, leaves only Integer and return that
 */
public class FilterArray {
    /**
     * Start
     */
    public static void start() {
        ArrayList list = new ArrayList();
        list.add("qwer");
        list.add(123);
        list.add(1);
        list.add(2);
        list.add("aasf");
        list.add(1);
        list.add("123");

        for (Object i : filter(list)) {
            System.out.println(i);
        }
    }

    /**
     * This is a filter
     * @param args
     * @return
     */
    private static ArrayList filter(ArrayList args) {
        ArrayList<Integer> list = new ArrayList<>();
        for (Object i : args) {
            if (i.getClass().getSimpleName().equals("Integer")) {
                list.add((Integer) i);
            }
        }
        return list;
    }
}
