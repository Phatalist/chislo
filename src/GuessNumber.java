import java.util.Random;

public class GuessNumber {
    public static void main(String[] args) {
        GuessInterface userInterface = new GuessInterface();
        GuessLogic generate = new GuessLogic();
        // 1. Научиться получить случайное число
        // Ctrl - Q
        generate.generateSecretNumber();

        // 2. Попросить у пользователя число и прочитать с консоли
        //   System.out.println
        //   java.util.Scanner
        //int number = userInterface.askForNumber();
        //System.out.println("Введенное число: " +number);
        // 3. Проверить число и указать больше оно или меньше нужного
        //int compareRes = generate.compareWithSecretNumber(number);
        generate.work();
        //    if( ... ) { /* выдать сообщение о победе */}
        //    else { /*выдать сообщение о больше/меньше */ } `
        // 4. Научиться повторять действия 2-3 в цикле
        //    while(...) {/* делаем действия 2 и 3*/}
        // 5. Когда цикл закончился - выдать правильный ответ
        //    System.out.println
    }
}
