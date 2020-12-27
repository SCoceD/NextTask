package com.javarush.task.task33.task3309;

/**
 * This function do simple Mathematics operation like add, minus, multiply, divide
 */
public class StandardMathematicOperation {
    /**
     * Start
     */
    public void start(  ) {
        System.out.println(calculator("+", 1, 1));
        System.out.println(calculator("-", 1, 1));
        System.out.println(calculator("*", 2, 2));
        System.out.println(calculator("/", 4, 2));
    }

    /**
     * This is calculator
     * @param operator
     * @param firstInt
     * @param secondInt
     * @return
     */
    private int calculator(String operator, int firstInt, int secondInt) {
        if (operator.equals("+")) {
            return add(firstInt, secondInt);
        } else if (operator.equals("-")) {
            return minus(firstInt, secondInt);
        } else if (operator.equals("*")) {
            return multiply(firstInt, secondInt);
        } else return divide(firstInt, secondInt);
    }

    /**
     * This function add two integer
     * @param firstInt
     * @param secondInt
     * @return
     */
    private int add(int firstInt, int secondInt) {
        return firstInt + secondInt;
    }

    /**
     * This function minus two integer
     * @param firstInt
     * @param secondInt
     * @return
     */
    private int minus(int firstInt, int secondInt) {
        return firstInt - secondInt;
    }

    /**
     * This function multiply two integer
     * @param firstInt
     * @param secondInt
     * @return
     */
    private int multiply(int firstInt, int secondInt) {
        return firstInt * secondInt;
    }

    /**
     * This function divide two integer
     * @param firstInt
     * @param secondInt
     * @return
     */
    private int divide(int firstInt, int secondInt) {
        return firstInt / secondInt;
    }
}
