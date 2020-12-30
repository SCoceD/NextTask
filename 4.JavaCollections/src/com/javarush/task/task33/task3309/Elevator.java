package com.javarush.task.task33.task3309;

/**
 * Спросить этаж
 * проверить на валидность
 * проверить нет требует ли пароля
 * * если не требует то пишем ок
 * * если требует то спросить пароль
 * * * проверить пароль
 * * * ответить про результат проверки
 */
public class Elevator {
    private final MyPrinter myPrinter;
    private final MyScanner myScanner;
    private int currentFloor;

    /**
     * Constructor
     */
    public Elevator() {
        myPrinter = new MyPrinter();
        myScanner = new MyScanner();
    }

    /**
     * Start
     */
    public void start() {
        int desiredFloor;
        do {
            String message = "Введите этаж";
            printer(message);
            desiredFloor = scanner();
            message = verifyFloorAndPass(desiredFloor);
            printer(message);
        } while (desiredFloor != 0);
    }

    /**
     * Verify floor exists, exists pass for enter on the floor. And if User already on the desired floor
     *
     * @param desiredFloor int
     * @return String
     */
    private String verifyFloorAndPass(int desiredFloor) {
        //Проверка не нажимаешь ли на тукущий этаж
        if (desiredFloor == currentFloor) {
            return "Вы уже на " + desiredFloor;
        }
        //Проверка на этаж с паролем
        if (desiredFloor > 3 && desiredFloor < 7) {
            printer("Введите пароль");
            boolean temp = checkPass(scanner());
            if (temp) {
                currentFloor = desiredFloor;
                return "ok";
            }
            return "не правильный пароль";
        }
        currentFloor = desiredFloor;
        return "ok";
    }

    /**
     * Pass checker
     *
     * @param passForCheck int
     * @return boolean
     */
    private boolean checkPass(int passForCheck) {
        int pass = 1337;
        return pass == passForCheck;
    }

    /**
     * Get som value from console
     *
     * @return int
     */
    private int scanner() {
        return myScanner.readInt();
    }

    /**
     * Print on the screen
     *
     * @param s String
     */
    private void printer(String s) {
        myPrinter.print(s);
    }
}