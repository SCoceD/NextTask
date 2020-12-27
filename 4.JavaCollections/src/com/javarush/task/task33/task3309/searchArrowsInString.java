package com.javarush.task.task33.task3309;

/**
 * This function counts how many arrows in String
 */
public class searchArrowsInString {
    int positionIndex = 0;
    int count = 0;
    final String str = "'><><><<>>--><<--<<asdadasp;amv;s,dc'.a/>?>?>?>?>>>>>????>>-->>>><<--<<'";

    /**
     * Start
     */
    public void start() {
        System.out.println("Count of left arrows: " + leftArrow(str));
        System.out.println("Count of right arrows: " + rightArrow(str));
    }

    /**
     * This function counts of left arrow
     *
     * @param args
     * @return int
     */
    private int leftArrow(String args) {
        positionIndex = 0;
        count = 0;

        while (args.indexOf(">>-->", positionIndex) != -1) {
            if (args.indexOf(">>-->", positionIndex) != -1) {
                positionIndex = args.indexOf(">>-->", positionIndex) + 1;
                count++;
            }
        }
        return count;
    }

    /**
     * This function counts of right arrow
     *
     * @param args
     * @return int
     */
    private int rightArrow(String args) {
        positionIndex = 0;
        count = 0;


        while (args.indexOf("<--<<", positionIndex) != -1) {
            if (args.indexOf("<--<<", positionIndex) != -1) {
                positionIndex = args.indexOf("<--<<", positionIndex) + 1;
                count++;
            }
        }
        return count;
    }
}