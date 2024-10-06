package src.romanr.hometask_11.task1;

public class Employee {
    private final String name;
    private final int teaNeeded;

    public Employee(String name, int teaNeeded) {
        this.name = name;
        this.teaNeeded = teaNeeded;
    }

    public String getName() {
        return name;
    }

    public int getNumOfNeededTea() {
        return teaNeeded;
    }
}
