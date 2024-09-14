package src.romanr;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class HomeTask_3 {

    static class HomeTask_3_2 {
        public static void main(String[] args) throws Exception {

            int[] oldArray = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 1, 2, 3};

            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter searching number");
            int enteredNumber = scanner.nextInt();
            int counterOfEnteredNumbers = 0;

            for (int i = 0; i < oldArray.length; i++) {
                if (oldArray[i] == enteredNumber) {
                    counterOfEnteredNumbers++;
                }
            }

            if (counterOfEnteredNumbers == 0) {
                throw new Exception("There is no such number");
            }

            int[] newArray = new int[oldArray.length - counterOfEnteredNumbers];

            for (int i = 0, j = 0; i < oldArray.length; i++) {
                if (oldArray[i] != enteredNumber) {
                    newArray[j] = oldArray[i];
                    j++;
                }
            }

            System.out.print("New array: " + Arrays.toString(newArray));
        }
    }

    static class HomeTask_3_3 {
        public static void main(String[] args) {

            Scanner scanner = new Scanner(System.in);
            Random random = new Random();

            System.out.println("Enter array size");
            int arraySize = scanner.nextInt();
            int min = Integer.MAX_VALUE, max = Integer.MIN_VALUE, avg, sum = 0;

            int[] array = new int[arraySize];
            for (int i = 0; i < arraySize; i++) {
                array[i] = random.nextInt();
                if (array[i] < min) {
                    min = array[i];
                }
                if (array[i] > max) {
                    max = array[i];
                }
                sum = sum + array[i];
            }

            avg = sum / arraySize;

            System.out.println("Array: " + Arrays.toString(array));
            System.out.println("Min: " + min + " Max: " + max + " Average: " + avg);
        }
    }

    //Создайте 2 массива из 5 чисел. Выведите массивы на консоль в двух отдельных строках.
    // Посчитайте среднее арифметическое элементов каждого массива и сообщите,
    // для какого из массивов это значение оказалось больше (либо сообщите, что их средние арифметические равны).
    static class HomeTask_3_4 {
        public static void main(String[] args) {

            int[] array1 = {1, 2, 3, 4, 5};
            int[] array2 = {6, 7, 8, 9, 10};

            System.out.println(Arrays.toString(array1));
            System.out.println(Arrays.toString(array2));

            int sum1 = 0, sum2 = 0;
            for (int elemFrom1stArray : array1) {
                sum1 += elemFrom1stArray;
            }
            for (int elemFrom2ndArray : array2) {
                sum2 += elemFrom2ndArray;
            }

            float avgNumberFrom1stArray = (float) sum1 / 5;
            float avgNumberFrom2ndArray = (float) sum2 / 5;

            if (avgNumberFrom1stArray == avgNumberFrom2ndArray) {
                System.out.println("Average numbers from arrays are equals");
            } else if (avgNumberFrom1stArray > avgNumberFrom2ndArray) {
                System.out.println("Average number from 1st array is bigger");
            } else {
                System.out.println("Average number from 2nd array is bigger");
            }
        }
    }


    // Задача 5. Создайте массив и заполните массив. Выведите массив на экран в строку.
    //Замените каждый элемент с нечётным индексом на ноль. Снова выведете массив на экран на отдельной строке.
    static class HomeTask_3_5 {
        public static void main(String[] args) {

            int[] array = new int[10];
            Arrays.fill(array, 5);
            System.out.println(Arrays.toString(array));

            for (int i = 0; i < array.length; i++) {
                if (i % 2 == 1) {
                    array[i] = 0;
                }
            }
            System.out.println(Arrays.toString(array));
        }
    }
}