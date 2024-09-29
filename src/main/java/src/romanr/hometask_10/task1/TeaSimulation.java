package src.romanr.hometask_10.task1;

public class TeaSimulation {
    public static void main(String[] args) {
        Office office = new Office();

        for (int day = 1; day <= 2; day++) {
            System.out.println("- День " + day + " -");
            office.fillTeaBank();
            office.simulateDay();
        }
    }
}
