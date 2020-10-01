package Lesson2;
import java.util.Arrays;
public class MainClass {

        public static void main(String[] args) {
            Task1();
            Task2();
            Task3();
            Task4();
            Task5();
            Task6();
            Task7();
        }

        public static void Task1() {
        /*1. Задать целочисленный массив, состоящий из элементов 0 и 1.
         Например: [ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ]. С помощью цикла и условия заменить 0 на 1, 1 на 0;*/
            //
            int[] intArray = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
            System.out.println("\n \n Задание №1: \n Массив до преобразования:");
            for (int j : intArray) {
                System.out.printf("%d  ", j);
            }
            System.out.println("\n Массив после преобразования:");
            for (
                    int i = 0;
                    i < intArray.length; i++) {
                if (intArray[i] == 1) {
                    intArray[i] = 0;
                } else {
                    intArray[i] = 1;
                }
                System.out.printf("%d  ", intArray[i]);
            }

        }


        public static void Task2() {
        /* 2. Задать пустой целочисленный массив размером 8.
         С помощью цикла заполнить его значениями 0 3 6 9 12 15 18 21;
         */
            int[] intArray2 = new int[8];
            for (int i = 0; i < intArray2.length; i++) {
                intArray2[i] = i * 3;
            }
            System.out.println("\n \n Задание №2: \n \n Массив:");
            for (int j : intArray2) {
                System.out.printf("%3d", j);
            }
        }


        public static void Task3() {
        /* 3. Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ]
         пройти по нему циклом, и числа меньшие 6 умножить на 2;*/
            int[] intArray3 = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
            System.out.println("\n \n Задание №3: \n \n Массив до преобразования:");
            for (int j : intArray3) {
                System.out.printf("%3d", j);
            }
            System.out.println("\n Массив после преобразования:");
            for (
                    int i = 0;
                    i < intArray3.length; i++) {
                if (intArray3[i] < 6) {
                    intArray3[i] = intArray3[i] * 2;
                }
                System.out.printf("%3d", intArray3[i]);
            }
        }


        public static void Task4() {
        /* 4. Создать квадратный двумерный целочисленный массив (количество строк и столбцов одинаковое),
         и с помощью цикла(-ов) заполнить его диагональные элементы единицами;*/
            System.out.println("\n \n Задание №4: \n Массив после преобразования:");
            int[][] arr = new int[4][4];
            for (int i = 0; i < 4; i++) {
                for (int j = 0; j < 4; j++) {
                    if ((i == j) || (j == (3 - i))) {
                        arr[i][j] = 1;
                    }
                }
            }
            for (int i = 0; i < 4; i++) {
                System.out.println("\n");
                for (int j = 0; j < 4; j++) {
                    System.out.printf("%3d", arr[i][j]);
                }
            }
        }


        public static void Task5() {
            /*5. ** Задать одномерный массив и найти в нем минимальный и максимальный элементы (без помощи интернета);*/
            int[] intArray5 = new int[8];
            for (int i = 0; i < intArray5.length; i++) {
                intArray5[i] = i * 3;
            }
            Arrays.sort(intArray5);
            int maxVal = intArray5[7];
            int minVal = intArray5[0];
            System.out.printf("\n \n Задание №5: \n \n Максимальное значение: %3d", maxVal);
            System.out.printf("\n \n Минимальное значение: %3d", minVal);
        }

        public static void Task6() {
            int[] intArray5 = new int[]{6, 2, 2, 2};
        /*6. Написать метод, в который передается не пустой одномерный целочисленный массив,
         метод должен вернуть true, если в массиве есть место, в котором сумма левой и правой части массива равны.
          Примеры: checkBalance([2, 2, 2, 1, 2, 2, || 10, 1]) → true, checkBalance([1, 1, 1, || 2, 1]) → true,
          граница показана символами ||, эти символы в массив не входят.*/
            System.out.printf("\n \n Задание 6: \n Есть равенство: %b", checkBalance(intArray5));
        }

        public static boolean checkBalance(int[] arr7) {
            int leftSum = 0;
            int rightSum;
            int allSum = 0;
            for (int i = 0, arr7Length = arr7.length; i < arr7Length; i++) {
                int j = arr7[i];
                allSum += j;
            }
            for (int i = 0; i < arr7.length; i++) {
                leftSum += arr7[i];
                rightSum = allSum - leftSum;
                if (leftSum == rightSum) {
                    return true;
                } else {
                    break;
                }
            }
            return false;
        }

        public static void Task7() {
             /*7. **** Написать метод, которому на вход подается одномерный массив и число n (может быть положительным, или отрицательным),
     при этом метод должен сместить все элементымассива на n позиций. Для усложнения задачи нельзя пользоваться
     вспомогательными массивами.*/

            System.out.printf("\n \n Задание 7: \n");
            int[] arr11 = new int[]{1, 2, 3, 4, 5, 6};
            for(int i = 0; i < arr11.length; i++) {
                System.out.println("arr11[" + i + "] = " + arr11[i]);
            }
            int[] arr20=ShiftArray(arr11, -1);

            System.out.printf("\n \n");
            for(int i = 0; i < arr20.length; i++) {
                System.out.println("arr20[" + i + "] = " + arr20[i]);
            }

        }

        public static int[] ShiftArray(int[] arr, int d) {
            int tmp;
            int shiftDelta;
            if (d == 0) {
                shiftDelta = 0;
            } else {
                if (Math.abs(d)  < arr.length) shiftDelta = d;
                else shiftDelta = arr.length - (arr.length % d);
            }
            for (int k = 0; k < Math.abs(shiftDelta); k++)
                if (shiftDelta < 0) {
                    tmp = arr[0];
                    for (int i = 0; i < arr.length-1; i++) arr[i] = arr[i+1];
                    arr[arr.length - 1] = tmp;
                } else {
                    tmp = arr[arr.length - 1];
                    for (int j = arr.length - 1; j >= 1; j--) arr[j] = arr[j - 1];
                    arr[0] = tmp;
                }
            return arr;
        }
    }
