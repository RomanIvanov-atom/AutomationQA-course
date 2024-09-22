package src.romanr.hometask_8.task2;

import java.util.Scanner;

public class BaseConverter {

    public enum Scale {
        C, F, K
    }

    public static double convert(double value, Scale from, Scale to) {

        if (from == to) return value;

        double celsius;
        switch (from) {
            case C -> celsius = value;
            case K -> celsius = value - 273.15;
            case F -> celsius = (value - 32) / 1.8;
            default -> throw new IllegalArgumentException("Unknown scale: " + from);
        }

        return switch (to) {
            case C -> celsius;
            case K -> celsius + 273.15;
            case F -> celsius * 1.8 + 32;
        };
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter temperature value: ");
        double value = scanner.nextDouble();

        System.out.print("Enter source scale (C, F, K): ");
        Scale from = Scale.valueOf(scanner.next().toUpperCase());

        System.out.print("Enter needed scale (C, F, K): ");
        Scale to = Scale.valueOf(scanner.next().toUpperCase());

        double result = convert(value, from, to);

        System.out.printf("Result of convert: %.2f %s -> %.2f %s", value, from, result, to);

        scanner.close();
    }
}
