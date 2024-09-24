package src.romanr.hometask_8.task1;

import java.util.Random;

public class Main {
    public static void main(String[] args) {

        Random random = new Random();

        //Создайте три экземпляра этого класса.
        Phone[] phones = {
                new Phone(random.nextInt(7_000_000, 10_000_000), "Samsung", 120),
                new Phone(random.nextInt(7_000_000, 10_000_000), "Xiaomi", 150),
                new Phone(random.nextInt(7_000_000, 10_000_000), "Iphone", 160)
        };

        //Выведите на консоль значения их переменных.
        //Вызвать эти методы для каждого из объектов.
        for (Phone phone : phones) {
            System.out.println(phone);
            phone.receiveCall(getRandomName().toString());
            System.out.println("Your number: " + phone.getNumber());
            phone.receiveCall(getRandomName().toString(), random.nextInt(7_000_000, 10_000_000));
            System.out.println();
        }

        //как работает sendMessage с несколькими парметрами
        System.out.println();
        int countOfNumbers = random.nextInt(1, 6);
        int[] randomNumbers = new int[countOfNumbers];

        for (int i = 0; i < countOfNumbers; i++) {
            randomNumbers[i] = random.nextInt(7_000_000, 10_000_000);
        }
        phones[0].sendMessage(randomNumbers);
    }

    public static NamesEnum getRandomName() {
        Random random = new Random();
        NamesEnum[] names = NamesEnum.values();
        int randIndex = random.nextInt(names.length);
        return names[randIndex];
    }
}
