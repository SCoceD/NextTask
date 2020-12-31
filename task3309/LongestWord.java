/**
 * Сросить строку
 * Посчитать количество слов в строке
 * * Заменить все не буквы пробелами
 * * Разделить строку по пробелу и положить в масив
 * * Удалить все пустые строки из масива
 * Вывести количество елемтов в масиве что будет соответсвовать количеству слов согластно условию задания (все что
 * не является буквой считается разделителем слов)
 */
public class LongestWord {
    private final MyScanner myScanner;
    private final MyPrinter myPrinter;

    /**
     * Constructor
     */
    LongestWord() {
        myScanner = new MyScanner();
        myPrinter = new MyPrinter();
    }

    /**
     * Start
     */
    public void start() {
        String stringFromUser = getStringFromUser();
        countWords(stringFromUser);
    }

    /**
     * Count words in String
     * @param stringFromUser String
     */
    private void countWords(String stringFromUser) {
        int intFromClearString = stringFromUser.replaceAll("[^a-zA-Z]", " ").trim().replaceAll(" +", " ").split(" ").length;
        printer(intFromClearString);
    }

    /**
     * Get string from User
     * @return
     */
    private String getStringFromUser() {
        return scanner();
    }

    /**
     * Get som value from console
     *
     * @return String
     */
    private String scanner() {
        return myScanner.readString();
    }

    /**
     * Print on the screen
     *
     * @param i int
     */
    private void printer(int i) {
        myPrinter.print(i);
    }
}
