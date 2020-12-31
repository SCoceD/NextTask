import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Спрашивать число и складывать в масив пока не введет 0 или достигнет 20
 * Проверять на не четность
 * найти ось
 * выводить построчно
 */
public class MiddlesThing {
    private final MyPrinter myPrinter;
    private final MyScanner myScanner;
    private final List<Integer> listOfLevel;
    private int middle;

    /**
     * Constructor
     */
    MiddlesThing() {
        myPrinter = new MyPrinter();
        myScanner = new MyScanner();
        listOfLevel = new ArrayList<>();
    }

    /**
     * Start
     */
    public void start() {
        getInt();
        searchMiddle();
        buildMiddlesThing();
    }

    /**
     * Draw middles thing on the screen
     */
    private void buildMiddlesThing() {
        for (Integer integer : listOfLevel) {
            for (int j = 0; j < middle - integer/2; j++) {
                if (j == middle - integer/2 - 1) {
                    for (int k = 0; k < integer; k++) {
                        printerInLine("*");
                    }
                    printer("");
                } else {
                    printerInLine(" ");
                }
            }
        }
    }

    /**
     * In line printer
     * @param s String
     */
    private void printerInLine(String s) {
        myPrinter.printInLine(s);
    }

    /**
     * Search middle and initialize variable
     */
    private void searchMiddle() {
        middle = (Collections.max(listOfLevel)+1) / 2;
    }

    /**
     * Get all levels of MiddlesThing and add only in list of levels middles thing
     */
    private void getInt() {
        String message = "Введите число";
        int temp;
        int maxThings = 20;
        do {
            printer(message);
            temp = scanner();
            if (temp % 2 == 0) {
                continue;
            }
            listOfLevel.add(temp);
        } while (listOfLevel.size() < maxThings && temp != 0);
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
