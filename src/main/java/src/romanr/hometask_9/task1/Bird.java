package src.romanr.hometask_9.task1;

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
