package Lesson4;

import com.sun.deploy.security.SelectableSecurityManager;

import java.util.Random;
import java.util.Scanner;

public class Main {
    static char[][] map;
    static final int SIZE = 5;
    static final int DOTS_TO_WIN = 4;

    static final char DOT_EMPTY = '.';
    static final char DOT_X = 'X';
    static final char DOT_O = 'O';

    public static void main(String[] args) {

        // 1. инициализировать поле
        initMap();

        // 1.1 Вывод поля
        printMap();

        // в цикле
        while (true) {
            // 2. Выбор игральной фишки. - ДОП К ДЗ
            // 3. Ход первого игрока.1
            makeHumanTurn();
            // 4. Вывод поля.
            printMap();
            // 5. Проверка на 3 в ряд и диагональ.
            if (hasWin(DOT_X)) {
                System.out.println("Победил человек!");
                break;
            }
            // 6. Проверка на ничью.
            if (isMapFull()) {
                System.out.println("Ничья");
                break;
            }

            // 7. Ход второго игрока (ИИ).
            makeAiTurn();

            // 8. Вывод поля.
            printMap();

            // 9. Проверка на 3 в ряд и диагональ.
            if (hasWin(DOT_O)) {
                System.out.println("Победил AI");
                break;
            }

            // 10. Проверка на ничью.
            if (isMapFull()) {
                System.out.println("Ничья");
                break;
            }
        }
    }

    // 1. Инициализация.
    static void initMap() {
        map = new char[SIZE][SIZE];

        for (int i = 0; i < map.length; i++) {
            for (int j = 0; j < map[i].length; j++) {
                map[i][j] = DOT_EMPTY;
            }
        }
    }

    // Вывод поля
    static void printMap() {
        for (int i = 0; i <= map.length; i++) {
            System.out.print(i + " ");
        }

        System.out.println();

        for (int i = 0; i < map.length; i++) {
            System.out.print((i + 1) + " ");
            for (int j = 0; j < map[i].length; j++) {
                System.out.print(map[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println();
    }

    // Ход первого игрока (человека)
    static void makeHumanTurn() {
        Scanner scanner = new Scanner(System.in);

        int x;
        int y;

        do {
            System.out.println("Введите координаты в формате X Y");
            x = scanner.nextInt()-1;
            y = scanner.nextInt()-1;
        } while (!isCellValid(x, y));

        map[y][x] = DOT_X;
    }

    // Ход второго игрока (ИИ)
    static void makeAiTurn() {
        Random random = new Random();

        int x;
        int y;

        do {
            System.out.println("Введите координаты в формате X Y");
            x = random.nextInt(SIZE);
            y = random.nextInt(SIZE);
        } while (!isCellValid(x, y));

        System.out.println("Компьютер сходил в точку: " + (x + 1) + " " + (y + 1));

        map[y][x] = DOT_O;
    }

    // Проверка хода
    static boolean isCellValid(int x, int y) {
        if (x < 0 || x >= SIZE || y < 0 || y >= SIZE) {
            return false;
        } else if (map[y][x] == DOT_EMPTY) {
            return true;
        } else {
            return false;
        }
    }

    // Проверка на победу
    static boolean hasWin(char symb) {
        int gCount = 0;
        int vCount = 0;
        boolean win=false;
        win=hasWinHor(symb)|| hasWinColomn(symb);
        // Проверка по диагоналям. Сдвигаем строки влево, таким образом, чтобы прямая диагональ выстроилась в столбец
        shiftArrayLeft(map);
        win=win||hasWinColomn(symb);
        // Проверка по диагоналям. Сдвигаем строки вправо, таким образом, чтобы обратная диагональ выстроилась в столбец
        shiftArrayRight(map);
        shiftArrayRight(map);
       win=win||hasWinColomn(symb);
        // Двигаем строки таблицы в исходное положение
        shiftArrayLeft(map);
        return win;
    }


        // Ничья
        static boolean isMapFull ()
        {
            for (int i = 0; i < map.length; i++) {
                for (int j = 0; j < map[i].length; j++) {
                    if (map[i][j] == DOT_EMPTY) {
                        return false;
                    }
                }
            }

            return true;
        }
    static boolean hasWinHor(char symb) {
        int gCount = 0;
        // проверка по строкам
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                if (map[i][j] == symb) {
                    gCount++;
                } else gCount=0;
                if (gCount >= DOTS_TO_WIN) return true;
            }
        }
        return false;
    }
    static boolean hasWinColomn(char symb) {
        int vCount = 0;
        // проверка по столбцам
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                if (map[j][i] == symb) {
                    vCount++;
                } else vCount=0;
                if (vCount >= DOTS_TO_WIN) return true;
            }
        }
        return false;
    }

    /*
    Сдвигаем строки для выстраивания диагоналий в столбцы с последующей проверкой на победу

    */
    public static char[] shiftRow(char[] arr, int d) {
        char tmp;
        int shiftDelta;
        if (d == 0) {
            shiftDelta = 0;
        } else {
            shiftDelta = arr.length % d;
        }
        for (int k = 0; k < shiftDelta; k++) {
            for (int i = 0; i < arr.length; i++) {
                if (shiftDelta < 0) {
                    tmp = arr[0];
                    arr[i] = arr[i - 1];
                    arr[arr.length - 1] = tmp;
                } else {
                    tmp = arr[arr.length - 1];
                    arr[arr.length - 2] = arr[arr.length - 1];
                    arr[0] = tmp;
                }


            }
        }
        return arr;
    }

    public static void shiftArrayLeft(char[][] arr2D) {
        for (int i = 1; i < SIZE; i++) {
            shiftRow(arr2D[i], -i);
        }
    }

    public static void shiftArrayRight(char[][] arr2D) {
        for (int i = 1; i < SIZE; i++) {
            shiftRow(arr2D[i], -i);
        }
    }

}

