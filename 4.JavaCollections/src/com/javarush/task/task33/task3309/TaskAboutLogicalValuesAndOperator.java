package com.javarush.task.task33.task3309;

/**
 * This function do logical operation whits array of logical expresion
 */
public class TaskAboutLogicalValuesAndOperator {
    public void start() {
        filter(new boolean[]{true, true, true, false}, "AND");
        filter(new boolean[]{true, true, true, false}, "OR");
        filter(new boolean[]{true, true, true, false}, "XOR");
        filter(new boolean[]{true, true, false, false}, "AND");
        filter(new boolean[]{true, true, false, false}, "OR");
        filter(new boolean[]{true, true, false, false}, "XOR");
        filter(new boolean[]{true, false, false, false}, "AND");
        filter(new boolean[]{true, false, false, false}, "OR");
        filter(new boolean[]{true, false, false, false}, "XOR");
        filter(new boolean[]{true, true}, "AND");
        filter(new boolean[]{true, true}, "OR");
        filter(new boolean[]{true, true}, "XOR");
        filter(new boolean[]{false, false}, "AND");
        filter(new boolean[]{false, false}, "OR");
        filter(new boolean[]{false, false}, "XOR");
        filter(new boolean[]{false}, "AND");
        filter(new boolean[]{false}, "OR");
        filter(new boolean[]{false}, "XOR");
        filter(new boolean[]{true}, "AND");
        filter(new boolean[]{true}, "OR");
        filter(new boolean[]{true}, "XOR");
        filter(new boolean[]{true, false, false, false}, "XOR");
    }

    /**
     * Start
     * @param args
     * @param operator
     */
    public void filter(boolean[] args, String operator) {
        if (operator.equals("AND")) {
            AND(args);
        } else if (operator.equals("OR")) {
            OR(args);
        } else {
            XOR(args);
        }
    }

    /**
     * This function compares all elements from array whits And(&&) operator
     * @param args
     */
    private void AND(boolean[] args){
        boolean temp = args[0];
        for (int i = 1; i < args.length; i++) {
            temp = temp && args[i];
        }
        System.out.println(temp);
    }

    /**
     *
     * This function compares all elements from array whits Or(||) operator
     * @param args
     */
    private void OR(boolean[] args){
        boolean temp = args[0];
        for (int i = 1; i < args.length; i++) {
            temp = temp || args[i];
        }
        System.out.println(temp);
    }

    /**
     * This function compares all elements from array whits Xor(^) operator
     * @param args
     */
    private void XOR(boolean[] args){
        boolean temp = args[0];
        for (int i = 1; i < args.length; i++) {
            temp = temp ^ args[i];
        }
        System.out.println(temp);
    }
}
