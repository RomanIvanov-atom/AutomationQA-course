package src.romanr.hometask_9.task1;

import java.util.Random;

public class Main {
    /*
        Создать массив из 10 объектов, заполненных случайным образом. ENUM??
        Пройтись по массиву, заставить всех , кто способен,
        говорить, плавать, летать, гулять.
        Вывести информацию о каждом животном
     */
    public static void main(String[] args) {

        Animal[] animals = new Animal[5];

        System.out.println("List of animals:");
        for (int i = 0; i < 5; i++) {
            animals[i] = getRandomAnimal();
            animals[i].doAction();
            System.out.println(animals[i].toString() + "\n");
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
