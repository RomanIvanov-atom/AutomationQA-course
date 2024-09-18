package src.romanr.hometask_7.task2;

public class Dog extends Animal{
    private final String ownerName;

    public String getOwnerName() {
        return ownerName;
    }

    public Dog(String name, int age, String ownerName) {
        super(name, age);
        this.ownerName = ownerName;
    }

    @Override
    public void toEat() {
        System.out.println("Dog is eating bones..");
    }

    @Override
    public String toString() {
        return "Dog{" +
                " id=" + getId() +
                ", name='" + getName() + "'" +
                ", age=" + getAge() +
                ", ownerName='" + getOwnerName() + "'" +
                '}';
    }

    @Override
    public void doAction() {
        System.out.println("Dog with id=" + getId() + " is walking in the morning");
    }
}
