package src.romanr.hometask_7.task2;

public interface Swimable {
    String getName();
    default void doAction() {
        System.out.println(this.getClass().getSimpleName() +
                " with name " + this.getName() + " is swimming");
    }
}
