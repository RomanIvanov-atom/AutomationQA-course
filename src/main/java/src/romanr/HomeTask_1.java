package src.romanr;

import java.math.BigDecimal;
import java.util.Scanner;

public class HomeTask_1 {

    static class HomeTask_1_1_tryToCreateMergeConflict {
        public static void main(String[] args) {

            Scanner scanner = new Scanner(System.in);
            System.out.println("Please, enter ur name: ");
            String name = scanner.nextLine();
            System.out.println("Welcome to Java, " + name);
        }
    }

    static class HomeTask_1_2 {
        public static void main(String[] args) {

            float avgHeight = 1.75f;
            int peopleCount = 10;

            float sumHeight = avgHeight * peopleCount;
            System.out.println(sumHeight);

        }
    }

    static class HomeTask_1_3 {
        public static void main(String[] args) {
            float amountRubles = 4567.56f;
            float amountDollars = 123.01f;
            float rubsPerDollar = 90.401f;

            BigDecimal bdRublesValue = new BigDecimal(Float.toString(amountRubles));
            BigDecimal bdDollarsValue = new BigDecimal(Float.toString(amountDollars));
            BigDecimal bdRubPerDollar = new BigDecimal(Float.toString(rubsPerDollar));

            BigDecimal dollarsConvertedToRub = bdDollarsValue.multiply(bdRubPerDollar);

            BigDecimal additionResult = dollarsConvertedToRub.add(bdRublesValue);
            BigDecimal subtractionResult = dollarsConvertedToRub.subtract(bdRublesValue);

            System.out.println("Summ of dollars and rubs in your bank account (in RUB): " + additionResult);
            System.out.println("Subtraction of dollars and rubs in your bank account (in RUB): " + subtractionResult);
        }
    }
}


