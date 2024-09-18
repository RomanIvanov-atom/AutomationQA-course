package src.romanr.hometask_7.task2;

public class Fish extends Animal implements Swimable {
    public Fish(String name, int age) {
        super(name, age);
    }

    @Override
    public void toEat() {
        System.out.println("Fish is eating bacteria");
    }

    @Override
    public String toString() {
        return "Fish{" +
                " id=" + getId() +
                ", name='" + getName() + "'" +
                ", age=" + getAge() +
                '}';
    }

    @Override
    public void doAction() {
        Swimable.super.doAction();
    }

}
