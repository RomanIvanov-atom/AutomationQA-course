package src.romanr.hometask_9.task1;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws Exception {

        Animal[] animals = new Animal[5];

        for (int i = 0; i < 5; i++) {
            animals[i] = getRandomAnimal();
        }

        Scanner scanner = new Scanner(System.in);

        System.out.println("List of animals:");
        while (true) {
            System.out.println(Arrays.toString(animals));
            System.out.println("Enter number for needed action: ");

            for (UserAction action : UserAction.values()) {
                System.out.println(action.getCode() + " to " + action.getDescription());
            }

            int code = scanner.nextInt();
            UserAction action;
            try {
                action = UserAction.valueOf(code);
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
                continue;
            }

            if (action == UserAction.EXIT) {
                break;
            } else {
                Main.processArray(animals, action);
            }
        }

        scanner.close();
    }

    private static void processArray(Animal[] animals, UserAction action) throws Exception {
        switch (action) {
            case FEED_ALL -> {
                System.out.println("Feeding all...");
                for (Animal animal : animals) {
                    animal.eat();
                }
            }
            case DO_ANIMAL_ACTION -> {
                System.out.println("Result of doing all actions:");
                for (Animal animal : animals) {
                    animal.doAction();
                }
            }
            case GET_ALL_INFO -> {
                System.out.println("All info:");
                for (Animal animal : animals) {
                    System.out.println(animal.toString());
                }
            }
            case GET_NAMES -> {
                System.out.println("All names:");
                for (Animal animal : animals) {
                    System.out.println(animal.getName());
                }
            }
            case GET_AGES -> {
                System.out.println("All ages:");
                for (Animal animal : animals) {
                    System.out.println(animal.getAge());
                }
            }
            case GET_IDS -> {
                System.out.println("All IDs:");
                for (Animal animal : animals) {
                    System.out.println(animal.getId());
                }
            }
            default -> throw new Exception("Error found; unexpected action of array");
        }
    }

    private static Animal getRandomAnimal() {
        Random random = new Random();
        int flag = random.nextInt(ANIMALS.values().length);
        int age = random.nextInt(1, 11);
        int maxHeight = random.nextInt(1000);

        ANIMALS animalType = ANIMALS.values()[flag];
        return switch (animalType) {
            case DOG -> new Dog("Baksik", age, "Vlad");
            case CAT -> new Cat("Mursik", age);
            case RAVEN -> new Raven("Karkusha", age, maxHeight);
            case FISH -> new Fish("Nemo", age);
            case PARROT -> new Parrot("Kesha", age, maxHeight);
        };

    }
}
