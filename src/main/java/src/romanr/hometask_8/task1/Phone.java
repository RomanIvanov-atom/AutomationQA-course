package src.romanr.hometask_8.task1;

/*
Задание 1. Создайте класс Phone, который содержит переменные number, model и
weight. Добавить в класс Phone методы: receiveCall, имеет один параметр – имя звонящего.
Выводит на консоль сообщение “Звонит {name}”. getNumber – возвращает номер телефона.
Добавить конструктор в класс Phone, который принимает на вход три параметра для инициализации
переменных класса - number, model и weight.
Добавить конструктор, который принимает на вход два параметра для инициализации
переменных класса - number, model. Добавить конструктор без параметров.
Вызвать из конструктора с тремя параметрами конструктор с двумя.
Добавьте перегруженный метод receiveCall, который принимает два параметра - имя звонящего
и номер телефона звонящего. Вызвать этот метод.
Создать метод sendMessage с аргументами переменной длины. Данный метод принимает
на вход номера телефонов, которым будет отправлено сообщение. Метод выводит на консоль
номера этих телефонов.
 */

public class Phone {
    private int number;
    private String model;
    private double weight;

    public Phone() {
    }

    public Phone(int number, String model) {
        this.number = number;
        this.model = model;
    }

    public Phone(int number, String model, double weight) {
        this(number, model);
        this.weight = weight;
    }

    public int getNumber() {
        return number;
    }

    public String getModel() {
        return model;
    }

    public double getWeight() {
        return weight;
    }

    public void receiveCall(String name) {
        System.out.println("Звонит " + name);
    }

    public void receiveCall(String name, int numberOfCaller) {
        System.out.println("Звонит " + name + " с номера " + numberOfCaller);
    }

    public void sendMessage(int... numbers) {
        System.out.println("Message sent to:");
        for (int number : numbers) {
            System.out.println(number);
        }
    }

    @Override
    public String toString() {
        return "Phone {" +
                "number=" + getNumber() +
                ", model='" + getModel() + "'" +
                ", weight=" + getWeight() +
                '}';
    }
}
