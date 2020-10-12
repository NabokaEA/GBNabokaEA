package Lesson3;
import java.util.Random;
import java.util.Scanner;
public class MainClass {
    public static Scanner sc = new Scanner(System.in);


    public static void main(String[] args) {
        int repeatGame = 1;
        do {

            // Генерируем случайное число в диапазоне от 0 до 9
            Random rand = new Random();
            int x = rand.nextInt(10);

            // Выводим сообщение с предложением угадать число
            System.out.println("Угадайте число от 0 до 9");

            for (int i = 0; i < 3; i++) {
                // Метод возвращает true в случае если пользователь угадал цифру и наоборот
                boolean result = GuessInt(x);
                if (result) {
                    System.out.printf("Поздравляю! Вы угадали! Задуманное число = %d \n", x);
                    break;
                }
            }
            System.out.printf("\n Повторить игру еще раз? 1 – да / 0 – нет \n");
            repeatGame = getNumberFromScanner("Введите число:", 0, 1);

        } while (repeatGame != 0);

    }

    // Метод принимает случайное число и сравнивает его с введенным пользователем.
    public static boolean GuessInt(int z) {
        int userInput = getNumberFromScanner("Введите число:", 0, 9);
        if (userInput == z) {
            return true;
        } else if (userInput < z) {
            System.out.println("Загаданное число больше введенного");
        } else {
            System.out.println("Загаданное число меньше введенного");
        }
        return false;
    }

    public static int getNumberFromScanner(String message, int min, int max) {
        int x;
        do {
            System.out.println(message);
            x = sc.nextInt();
        } while (x < min || x > max);
        return x;
    }

}
