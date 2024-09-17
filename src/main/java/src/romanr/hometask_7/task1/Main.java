package src.romanr.hometask_7.task1;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Figure[] figures = new Figure[5];
        int[] intFigures = new int[5];
        double globalPerimeterSumma = 0;

        Random random = new Random();
        for (int i = 0; i < figures.length; i++) {
            intFigures[i] = random.nextInt(1, 4);
            switch (intFigures[i]) {
                case 1 -> figures[i] = new Triangle(random.nextDouble(1.0, 10.0),
                        random.nextDouble(1.0, 10.0), random.nextDouble(1.0, 10.0));
                case 2 -> figures[i] = new Rectangle(random.nextDouble(1.0, 10.0), random.nextDouble(1.0, 10.0));
                case 3 -> figures[i] = new Circle(random.nextDouble(1.0, 10.0));
            }
            System.out.println(figures[i]);
            globalPerimeterSumma += figures[i].getPerimeter();
        }
        System.out.println("Summa of all perimeters = " + String.format("%.2f", globalPerimeterSumma));
    }
}
