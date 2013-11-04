import java.util.Random;

public class GuessNumber {
    public static void main(String[] args) {
        // 1. Научиться получить случайное число
        // Ctrl - Q
        Random r = new Random();
        int randomNumber = 1 + r.nextInt(100);
        System.out.println("Случайное число: " + randomNumber);
        // 2. Попросить у пользователя число и прочитать с консоли
        //   System.out.println
        //   java.util.Scanner
        // 3. Проверить число и указать больше оно или меньше нужного
        //    if( ... ) { /* выдать сообщение о победе */}
        //    else { /*выдать сообщение о больше/меньше */ } `
        // 4. Научиться повторять действия 2-3 в цикле
        //    while(...) {/* делаем действия 2 и 3*/}
        // 5. Когда цикл закончился - выдать правильный ответ
        //    System.out.println
    }
}
