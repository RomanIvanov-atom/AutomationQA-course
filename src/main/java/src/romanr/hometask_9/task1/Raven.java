package src.romanr.hometask_9.task1;

public class Raven extends Bird implements Flyable {

    public Raven(String name, int age, int maxHeight) {
        super(name, age, maxHeight);
    }

    @Override
    public void eat() {
        System.out.println("Raven is eating meat..");
    }

    @Override
    public String toString() {
        return "Raven {" +
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
