/**
 * Получаем размер ёлки от юзера
 * Рисуем ёлку
 */
public class ChristmasTree {
    private final MyScanner myScanner;
    private final MyPrinter myPrinter;
    private int widthOfLine = 1;
    private int countOfAsterisk = 1;
    private int treeSize;

    /**
     * Constructor
     */
    ChristmasTree() {
        myScanner = new MyScanner();
        myPrinter = new MyPrinter();
    }

    /**
     * Start
     */
    public void start() {
        treeSize = scanner();
        printTree();
        drawLegOfTree();
    }

    /**
     * Draw Tree
     */
    private void printTree() {
        for (int i = 1; i < treeSize + 1; i++) {
            printOneTreeLine();
            printer("\n");
        }
    }

    /**
     * Print onr line from tree
     */
    private void printOneTreeLine() {
        for (int j = 0; j < treeSize; j++) {
            if (j == treeSize - widthOfLine) {
                for (int k = countOfAsterisk; k > 0; k--) {
                    printer("*");
                }
                countOfAsterisk += 2;
            } else {
                printer(" ");
            }
        }
        widthOfLine++;
    }

    /**
     * Draw leg of tree
     */
    private void drawLegOfTree() {
        for (int i = 1; i < treeSize; i++) {
            printer(" ");
        }
        printer("*");
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
        myPrinter.printInLine(s);
    }
}
