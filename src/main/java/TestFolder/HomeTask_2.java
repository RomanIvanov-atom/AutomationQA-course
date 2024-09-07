package TestFolder;

import java.util.Scanner;

public class HomeTask_2 {

    static class HomeTask_2_1 {
        public static void main(String[] args) {

            System.out.println("Please, enter month's number");
            int monthNum = new Scanner(System.in).nextInt();

            switch (monthNum) {
                case 12, 1, 2: {
                    System.out.println("It's winter");
                    break;
                }
                case 3, 4, 5: {
                    System.out.println("It's spring");
                    break;
                }
                case 6, 7, 8: {
                    System.out.println("It's summer");
                    break;
                }
                case 9, 10, 11: {
                    System.out.println("It's autumn");
                    break;
                }
                default: {
                    System.out.println("Wrong input data!");
                    break;
                }
            }
        }
    }

    static class Homework_2_2 {
        public static void main(String[] args) {

            System.out.println("Enter any number");
            int enteredNumber = new Scanner(System.in).nextInt();

            if (enteredNumber % 2 == 0) {
                System.out.println("Number is even");
            } else {
                System.out.println("Number is odd");
            }
        }
    }

//            Если t>–5, то вывести «Тепло».
//            Если –5>= t > –20, то вывести «Нормально».
//            Если –20>= t, то вывести «Холодно».

    static class Homework_2_3 {
        public static void main(String[] args) {

            System.out.println("Enter outside temperature");
            double outsideTemp = new Scanner(System.in).nextDouble();

            if (outsideTemp > -5) {
                System.out.println("Тепло");
            } else if (outsideTemp > -20) {
                System.out.println("Нормально");
            } else if (outsideTemp <= -20)
                System.out.println("Холодно");
        }
    }

    static class Homework_2_4_1 {
        public static void main(String[] args) {

            for (int i = 1; i <= 99; i++) {
                if (i % 2 == 1) {
                    System.out.println(i);
                }
            }
        }
    }

    static class Homework_2_4_2 {
        public static void main(String[] args) {

            for (int i = 5; i >= 1; i--) {
                System.out.println(i);
            }
        }
    }

    static class Homework_2_5 {
        public static void main(String[] args) throws Exception {

            System.out.println("Enter any positive in number");
            int enteredNum = new Scanner(System.in).nextInt();
            int result = 0;

            if (enteredNum <= 0) {
                throw new Exception("Invalid input data");
            }

            for (int i = 1; i <= enteredNum; i++) {
                result += i;
            }
            System.out.println("Summ from 1 to " + enteredNum + " = " + result);
        }
    }

    static class Homework_2_6 {
        public static void main(String[] args) {
            //7 14 21 28 35 42 49 56 63 70 77 84 91 98.

            int i = 1;
            while (i <= 14) {
                System.out.print(7 * i + " ");
                i++;
            }
        }
    }

    static class Homework_2_7 {
        public static void main(String[] args) {
            //на экран квадраты чисел от 10 до 20 включительно

            System.out.println("x  -> x^2");

            for (int i = 10; i <= 20; i++) {
                System.out.println(i + " -> " + Math.round(Math.pow(i, 2)));
            }
        }
    }

    static class Homework_2_8 {
        public static void main(String[] args) {
            //Вывести первые 11 членов ряда Фибоначчи
            //любым циклом

            int first = 1, second = 1;
            System.out.print(first + " " + second + " ");

            for (int i = 3; i <= 11; i++) {
                int next = first + second;
                System.out.print(next + " ");
                first = second;
                second = next;
            }
        }
    }

    static class Homework_2_9 {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            int prev = -2_147_483_648, actual = -1;
            while (true) {
                System.out.println("Enter any number except 0");
                System.out.println("Enter same number again to exit");
                actual = scanner.nextInt();

                while (actual == 0) {
                    System.out.println("Enter any number except 0 !");
                    actual = scanner.nextInt();
                }
                if (actual % 2 == 0) {
                    System.out.println("Number is even");
                } else {
                    System.out.println("Number is odd");
                }
                if (actual == prev) {
                    System.out.println("You have entered same number twice");
                    System.out.println("Program closing is launched...");
                    break;
                }
                prev = actual;
            }
            scanner.close();
        }
    }

    //За каждый месяц банк начисляет к сумме вклада 7% от суммы.
    //Напишите программу, в которую пользователь вводит сумму вклада и количество месяцев.
    // А банк вычисляет конечную сумму вклада с учетом начисления процентов за каждый месяц.
    // Для вычисления суммы с учетом процентов используйте цикл for. Пусть сумма вклада будет представлять тип float.

    static class Homework_2_10 {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.println("Enter summ");
            float initSumm = scanner.nextFloat();
            System.out.println("Enter months");
            int months = scanner.nextInt();
            float resultSumm = initSumm;

            for (int i = 1; i <= months; i++) {
                resultSumm = (float) (resultSumm + 0.07 * resultSumm);
            }

            System.out.println("Result summ: " + String.format("%.2f", resultSumm));
        }
    }
}