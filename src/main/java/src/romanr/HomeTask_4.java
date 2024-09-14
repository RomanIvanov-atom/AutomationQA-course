package src.romanr;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class HomeTask_4 {

    // Задача 1. Создать трехмерный массив из целых чисел,
    // заполнить случайными числами от -100 до 100.
    // С помощью циклов "пройти" по всему массиву и увеличить каждый элемент на заданное число.
    // Пусть число, на которое будет увеличиваться каждый элемент,задается из консоли.
    static class HomeTask_4_1 {

        public static void main(String[] args) {

            Random random = new Random();
            int[][][] threeDimensionalArray = new int[3][2][6];

            for (int i = 0; i < threeDimensionalArray.length; i++) {
                for (int j = 0; j < threeDimensionalArray[i].length; j++) {
                    for (int k = 0; k < threeDimensionalArray[i][j].length; k++) {
                        threeDimensionalArray[i][j][k] = random.nextInt(-100, 101);
                    }
                }
            }

            for (int i = 0; i < threeDimensionalArray.length; i++) {
                for (int j = 0; j < threeDimensionalArray[i].length; j++) {
                    System.out.println(Arrays.toString(threeDimensionalArray[i][j]));
                }
                System.out.println();
            }

            System.out.println("Enter increment: ");
            Scanner sc = new Scanner(System.in);
            int increment = sc.nextInt();

            for (int i = 0; i < threeDimensionalArray.length; i++) {
                for (int j = 0; j < threeDimensionalArray[i].length; j++) {
                    for (int k = 0; k < threeDimensionalArray[i][j].length; k++) {
                        threeDimensionalArray[i][j][k] += increment;
                    }
                }
            }

            for (int i = 0; i < threeDimensionalArray.length; i++) {
                for (int j = 0; j < threeDimensionalArray[i].length; j++) {
                    System.out.println(Arrays.toString(threeDimensionalArray[i][j]));
                }
                System.out.println();
            }
        }
    }

    //Задача 2. Шахматная доска
    //Создать программу для раскраски шахматной доски с помощью цикла.
    // Создать двумерный массив char'ов 8х8.
    // С помощью циклов задать элементам массива значения B(Black) или W(White).
    // Результат работы программы:
    //W B W B W B W B
    //B W B W B W B W
    //W B W B W B W B
    //B W B W B W B W
    //W B W B W B W B
    //B W B W B W B W
    //W B W B W B W B
    //B W B W B W B W
    static class HomeTask_4_2 {

        public static void main(String[] args) {

            char[][] chess = new char[8][8];

            for (int i = 0; i < chess.length; i++) {
                for (int j = 0; j < chess[i].length; j++) {

                    // 1ый способ
//                    if ((i % 2 == 0) && (j % 2 == 0)) {
//                        chess[i][j] = 'W';
//                    } else if ((i % 2 == 1) && (j % 2 == 0))  {
//                        chess[i][j] = 'B';
//                    } else if (i % 2 == 0) {
//                        chess[i][j] = 'B';
//                    } else {
//                        chess[i][j] = 'W';
//                    }

                    // 2ой способ
                    if ((i + j) % 2 == 0) {
                        chess[i][j] = 'W';
                    } else {
                        chess[i][j] = 'B';
                    }
                }
            }

            for (int i = 0; i < chess.length; i++) {
                for (int j = 0; j < chess[i].length; j++) {
                    System.out.print(chess[i][j] + " ");
                }
                System.out.println();
            }
        }
    }

    //Задача 3. Создайте двумерный массив размера n*n, n вводится с консоли от 2 до 6,
    // после чего заполняется случайными элементами от -100 до 100.
    // Выведите на консоль сумму элементов диагоналей массива.
    static class HomeTask_4_3 {

        public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);
            Random random = new Random();
            System.out.println("Enter int number from 2 to 6");
            int n = sc.nextInt();
            if (n < 2 || n > 6) {
                System.out.println("Invalid input data");
                return;
            }

            int[][] arraySquare = new int[n][n];

            for (int i = 0; i < arraySquare.length; i++) {
                for (int j = 0; j < arraySquare[i].length; j++) {
                    arraySquare[i][j] = random.nextInt(-100, 101);
                    System.out.print(arraySquare[i][j] + " ");
                }
                System.out.println();
            }

            int mainDaigSum = 0, sideDiagSum = 0;
            for (int i = 0, j = 0; i < arraySquare.length; i++, j++) {
                mainDaigSum += arraySquare[i][j];
            }
            for (int i = arraySquare.length - 1, j = 0; i >= 0; i--, j++) {
                sideDiagSum += arraySquare[i][j];
            }

            System.out.println("Sum of main diagonal: " + mainDaigSum);
            System.out.println("Sum of side diagonal: " + sideDiagSum);
        }
    }

    //Задача 4. Создать двумерный массив  m*n, где m,n вводятся с клавиатуры, оба >= 3.
    // Заполнить случайными числами,отсортировать каждую строку отдельно
    // по возрастанию с применением Arrays.sort()
    static class HomeTask_4_4 {

        public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);
            Random random = new Random();
            System.out.println("Enter number of rows (more than 2)");
            int n = sc.nextInt();
            System.out.println("Enter number of columns (more than 2)");
            int m = sc.nextInt();

            if (n <= 2 || m <= 2) {
                System.out.println("Invalid input data");
                return;
            }

            int[][] array = new int[n][m];

            System.out.println("Unsorted array: ");
            for (int i = 0; i < array.length; i++) {
                for (int j = 0; j < array[i].length; j++) {
                    array[i][j] = random.nextInt(-10, 11);
                    System.out.print(array[i][j] + " ");
                }
                System.out.println();
            }

            for (int[] rows : array) {
                Arrays.sort(rows);
            }

            System.out.println("Sorted array: ");
            for (int i = 0; i < array.length; i++) {
                for (int j = 0; j < array[i].length; j++) {
                    System.out.print(array[i][j] + " ");
                }
                System.out.println();
            }
        }
    }
}
