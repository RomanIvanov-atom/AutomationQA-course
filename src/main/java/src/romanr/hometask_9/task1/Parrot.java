package src.romanr.hometask_9.task1;

public class Parrot extends Bird implements Flyable {


    public Parrot(String name, int age, int maxHeight) {
        super(name, age, maxHeight);
    }

    @Override
    public void eat() {
        System.out.println("Parrot is eating wheat..");
    }

    @Override
    public String toString() {
        return "Parrot {" +
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
