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
        return 0;
    }

    /**
     * В цикле проверяет число и взаимодействует с пользователем.
     */
    void work() {
        for(int i = 0; i < 8; ++i) {

        }
    }
}
