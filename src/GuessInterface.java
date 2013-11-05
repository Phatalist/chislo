/**
 * Created by IntelliJ IDEA.
 * User: fake
 * Date: 02.11.13
 * Time: 17:40
 * To change this template use File | Settings | File Templates.
 */
public class GuessInterface {
    /**
     * Печатает просьбу о вводе числа.
     * Считывает число, проверяет что оно входит в диапазон [1...100]. Если не входит - то переспрашивает до победы.
     * Возвращает прочитанное число.
     */
    int askForNumber() {
        System.out.println("Введите число: ");
        java.util.Scanner sc = new java.util.Scanner(System.in);
        int num = 0;
        if (sc.hasNextInt() == true){
            num = sc.nextInt();
            if (num >= 1 && num <= 100){
                return num;
            }
            else {
                System.out.println("Введенное число не выходит в диапазон. Повторите попытку");
                askForNumber();
            }
        }
        else {
            System.out.println("Ошибка ввода. Ведите целое число: ");
            askForNumber();
        }
        return 0;
    }

    /**
     * Выдаем сообщение о том, что задуманное число меньше
     */
    void printMessageIfLess() {
        System.out.println("Загаданное число меньше, повторите попытку");

    }

    /**
     * Выдаем сообщение о том, что задуманное число больше
     */
    void printMessageIfGreater() {
        System.out.println("Загаданное число больше, повторите попытку");
    }

    void printWin() {
        System.out.println("Вы угадали");
    }

    void printGameOver() {
        System.out.println("Вы проиграли");
    }
}
