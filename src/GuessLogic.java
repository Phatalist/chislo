import java.util.Random;

/**
 * Created by IntelliJ IDEA.
 * User: fake
 * Date: 02.11.13
 * Time: 17:40
 * To change this template use File | Settings | File Templates.
 */
public class GuessLogic {
    private int secretNumber;
    GuessInterface userInterface = new GuessInterface();

    /**
     * Загадаывает секретное число и сохраняет его в поле secretNumber.
     */
    void generateSecretNumber() {
        Random r = new Random();
        secretNumber = 1 + r.nextInt(100);
        System.out.println("загаданное число: " +secretNumber);
    }

    /**
     * Сравнивает загаданное число и секретное число.
     * Возвращет 0, если загаданное число больше совпало
     * Возвращает -1, если загаданное число меньше
     * Возвращает 1, если загаданное число больше.
     *
     * Для продвинутых: возвращать экземляр перечислимого типа (enum).
     */
    int compareWithSecretNumber(int guessedNumber) {
        if (guessedNumber == secretNumber) {
            return 0;
        }
        else if (guessedNumber > secretNumber) {
            return -1;
        }
        else if (guessedNumber < secretNumber){
            return 1;
        }
        return 999;
    }

    /**
     * В цикле проверяет число и взаимодействует с пользователем.
     */
    void work() {
        for(int i = 0; i < 8; ++i) {
            int asked = userInterface.askForNumber();
            int compareResult = compareWithSecretNumber(asked);
            if (compareResult == 0){
                userInterface.printWin();
            }
            else if(compareResult == -1){
                userInterface.printMessageIfLess();

            }
            else if (compareResult == 1){
                userInterface.printMessageIfGreater();
            }
        }
    }


}
