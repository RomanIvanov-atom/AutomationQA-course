package src.romanr.hometask_9.task1;

public abstract class Animal {
    public static int idCounter = 1;
    public int id;
    public String name;
    public int age;

    public Animal(String name, int age) {
        this.id = idCounter++;
        this.name = name;
        this.age = age;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public abstract void eat();
    public abstract String toString();
    public abstract void doAction();
}
