package src.romanr.hometask_10.task1;

import java.util.*;

public class Office {
    private final List<Tea> teaBank = new ArrayList<>();
    private final List<Employee> employees = new ArrayList<>();

    Random random = new Random();

    public Office() {
        for (int i = 1; i <= 5; i++) {
            int desiredTea = random.nextInt(6);
            String name = "Сотрудник #" + i;
            employees.add(new Employee(name, desiredTea));
        }
    }

    public void fillTeaBank() {
        int newTeaCount = random.nextInt(10, 21);
        for (int i = 0; i < newTeaCount; i++) {
            teaBank.add(new Tea(TeaType.getRandomTeaTypeName())); // три типа чая
        }
        System.out.println("В начале дня было добавлено " + newTeaCount + " новых пакетиков чая");
        System.out.println("Количество пакетиков чая в начале дня: " + teaBank.size());
    }

    public void simulateDay() {
        System.out.println("День начинается!");
        int totalTeaConsumed = 0;
        int initialTeaCount = teaBank.size();

        for (Employee employee : employees) {
            int teaDesired = employee.getNumOfNeededTea();
            System.out.println(employee.getName() + " хочет выпить " + teaDesired + " чашек чая.");

            int teaConsumedByEmployee = 0;

            for (int i = 0; i < teaDesired; i++) {
                if (!teaBank.isEmpty()) {
                    Tea tea = teaBank.remove(0);
                    totalTeaConsumed++;
                    teaConsumedByEmployee++;
                    System.out.println(employee.getName() + " выпил " + tea.getType());
                } else {
                    System.out.println("Для " + employee.getName() + " не достался чай. Не хватает " + (teaDesired - i) + " пакетиков.");
                    break;
                }
            }

            if (teaDesired > teaConsumedByEmployee) {
                System.out.println(employee.getName() + " не смог выпить " + (teaDesired - teaConsumedByEmployee) + " чашек.");
            }
        }

        System.out.println("Всего выпито чашек чая: " + totalTeaConsumed);
        System.out.println("Количество оставшихся пакетиков чая в этот день: " + (initialTeaCount - totalTeaConsumed));
        System.out.println("День закончился!\n");
    }
}

