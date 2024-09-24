package src.romanr.hometask_9.task1;

public interface Flyable {
    String getName();
    int getMaxHeight();
    default void doAction() {
        System.out.println(this.getClass().getSimpleName() +
                " with name " + this.getName() + " is flying max on " + getMaxHeight() + "height");
    }
}
