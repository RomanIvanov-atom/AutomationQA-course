package src.romanr.hometask_9.task2;

public class Main {
    public static void main(String[] args) {
        try {
            boolean result = Validator.validate("Login", "password1", "password");
            System.out.println("Result: " + result);
        } catch (WrongLoginException | WrongPasswordException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
