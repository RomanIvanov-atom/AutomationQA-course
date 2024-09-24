package src.romanr.hometask_9.task1;

public class Cat extends Animal {
    public Cat(String name, int age) {
        super(name, age);
    }

    @Override
    public void eat() {
        System.out.println("Cat is eating fish..");
    }

    @Override
    public String toString() {
        return "Cat {" +
                " id=" + getId() +
                ", name='" + getName() + "'" +
                ", age=" + getAge() +
                '}';
    }

    @Override
    public void doAction() {
        System.out.println("Cat with id=" + getId() + " is loudly MEOWing!");
    }
}
