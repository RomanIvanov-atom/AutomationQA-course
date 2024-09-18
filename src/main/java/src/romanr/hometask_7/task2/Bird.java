package src.romanr.hometask_7.task2;

public abstract class Bird extends Animal {
    int maxHeight;

    public int getMaxHeight() {
        return maxHeight;
    }

    public Bird(String name, int age, int maxHeight) {
        super(name, age);
        this.maxHeight = maxHeight;
    }
}
