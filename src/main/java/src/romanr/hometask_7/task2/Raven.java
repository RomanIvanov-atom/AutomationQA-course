package src.romanr.hometask_7.task2;

public class Raven extends Bird implements Flyable {

    public Raven(String name, int age, int maxHeight) {
        super(name, age, maxHeight);
    }

    @Override
    public void toEat() {
        System.out.println("Raven is eating meat..");
    }

    @Override
    public String toString() {
        return "Raven{" +
                " id=" + getId() +
                ", name='" + getName() + "'" +
                ", age=" + getAge() +
                ", maxHeight=" + getMaxHeight() +
                '}';
    }

    @Override
    public void doAction() {
        Flyable.super.doAction();
    }
}
