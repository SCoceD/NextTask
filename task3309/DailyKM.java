/**
 * сапрсить сколько км проходит
 * присвоить ответ в переменную
 * если меньше 4х дать ответ мало
 * елси больше 3х ответ красавчик
 */
public class DailyKM {
    private final MyPrinter printer;
    private final MyScanner scanner;

    /**
     * Constructor
     */
    public DailyKM() {
        printer = new MyPrinter();
        scanner = new MyScanner();
    }

    /**
     * Start
     */
    public void start() {
        int distance;
        String message = "Сколько км в день ты прохолишь?";
        printer(message);
        do {
            distance = scanner();
            if (distance < 0) {
                printer("Не ври!");
            }
        } while (distance < 0);
        scanner.close();
        message = estimateResult(distance) ? "Красавчик!" : "Мало!";
        printer.print(message);
    }

    /**
     * Get som value from console
     *
     * @return int
     */
    private int scanner() {
        return scanner.readInt();
    }

    /**
     * Print on the screen
     *
     * @param s String
     */
    private void printer(String s) {
        printer.print(s);
    }

    /**
     * Estimate User result
     *
     * @param distance int
     * @return boolean
     */
    private boolean estimateResult(int distance) {
        return distance > 3;
    }
}
