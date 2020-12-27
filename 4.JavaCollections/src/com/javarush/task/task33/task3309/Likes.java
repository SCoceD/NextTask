package com.javarush.task.task33.task3309;

/**
 * This function show how much like somethings
 */
public class Likes {
    /**
     * Start
     * @param names
     */
    public void start(String... names) {
        if (names.length == 0) {
            zeroLikes();
        } else if (names.length == 1) {
            oneLike();
        } else if (names.length == 2) {
            twoLikes();
        } else if (names.length == 3) {
            threeLikes();
        } else {
            moreThreeLikes();
        }
    }

    /**
     * Hear show that no body likes this
     */
    private void zeroLikes() {
        System.out.println("no one likes this");
    }

    /**
     * Hear show that one person like this and show his name
     * @param names
     */
    private void oneLike(String... names) {
        System.out.println(names[0] + " likes this");
    }

    /**
     * Hear show that two person likes this and show his names
     * @param names
     */
    private void twoLikes(String... names) {
        System.out.println(names[0] + " and " + names[1] + " like this");
    }

    /**
     * Hear show that three person like this and show his names
     * @param names
     */
    private void threeLikes(String... names) {
        System.out.println(names[0] + ", " + names[1] + " and " + names[2] + " like this");
    }

    /**
     * Hear show that more than three person like this and show his names
     * @param names
     */
    private void moreThreeLikes(String... names) {
        System.out.println(names[0] + ", " + names[1] + " and " + (names.length - 2) + " others like this");
    }
}
