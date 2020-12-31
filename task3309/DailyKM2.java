/**
 * спросить сколько Км проходит в день
 * присвоить ответ в переменную
 * проверить ответ
 * показать резальтат
 */
public class DailyKM2 {
    private final MyScanner scanner;
    private final MyPrinter printer;

    /**
     * Constructor
     */
    public DailyKM2() {
        scanner = new MyScanner();
        printer = new MyPrinter();
    }

    /**
     * Start
     */
    public void start() {
        int result;
        String message;
        printer("Сколько км в день ты прохолишь?");
        boolean temp = true;
        do {
            result = scanner();
            int physicalMin = 0;
            int physicalMax = 20;
            if (result >= physicalMin && result <= physicalMax) {
                temp = false;
            } else {
                printer("Прекращай врать!");
            }
        } while (temp);
        scanner.close();
        message = estimateResult(result);
        printer(message);
    }

    /**
     * Get some value from console
     *
     * @return int
     */
    private int scanner() {
        return scanner.readInt();
    }

    /**
     * Print on the screen
     *
     * @param s
     */
    private void printer(String s) {
        printer.print(s);
    }

    /**
     * Estimate user success
     *
     * @param result
     * @return
     */
    private String estimateResult(int result) {
        if (result < 4) {
            return "мало";
        } else if (result < 20) {
            return "Красавчик!";
        } else {
            return "Марафонец!";
        }
    }
}
