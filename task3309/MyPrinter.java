/**
 * My custom method print on the screen
 */
public class MyPrinter implements MyPrinterInterface {
    /**
     * Default constructor
     */
    public MyPrinter() {
    }

    /**
     * Print string in one line(without /n) on the screen
     *
     * @param s String
     */
    @Override
    public void printInLine(String s) {
        System.out.print(s);
    }

    @Override
    public void printInLine(int i){
        System.out.print(i);
    }

    /**
     * Print String on the screen
     *
     * @param s String
     */
    @Override
    public void print(String s) {
        System.out.println(s);
    }
    /**
     * Print int on the screen
     *
     * @param i int
     */
    @Override
    public void print(int i) {
        System.out.println(i);
    }
}
