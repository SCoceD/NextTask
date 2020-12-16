package com.javarush.task.task33.task3309;

//            '><><><<>>--><<--<<asdadasp;amv;s,dc'.a/>?>?>?>?>>>>>????>>-->>>><<--<<'
//            >>--> || <--<<
public class searchArrowsInString {
    public static void main(String[] args) {
        String str = "'><><><<>>--><<--<<asdadasp;amv;s,dc'.a/>?>?>?>?>>>>>????>>-->>>><<--<<'";
        int positionIndex = 0;
        int positionIndex1 = 0;
        int count = 0;
        while (str.indexOf(">>-->", positionIndex) != -1) {
            if (str.indexOf(">>-->", positionIndex) != -1) {
                positionIndex = str.indexOf(">>-->", positionIndex) + 1;
                count++;
            }
        }
        while (str.indexOf("<--<<", positionIndex1) != -1) {
            if (str.indexOf("<--<<", positionIndex1) != -1) {
                positionIndex1 = str.indexOf("<--<<", positionIndex1) + 1;
                count++;
            }
        }
        System.out.println(count);
    }
}