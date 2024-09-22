package src.romanr.hometask_9.task2;

/*Создать класс, в котором будет статический метод.
Этот метод принимает на вход три параметра: Login, Password, confirmPassword.
Все поля имеют тип данных String. Длина login должна быть меньше 20 символов (метод length())
и не должен содержать пробелы (метод contains(...)). Если login не соответствует
этим требованиям, необходимо выбросить  WrongLoginException.
Длина password должна быть меньше 20 символов, не должен содержать пробелом и должен
содержать хотя бы одну цифру 1. Также password и confirmPassword должны быть равны.
Если password не соответствует этим требованиям, необходимо выбросить WrongPasswordException.
WrongPasswordException и WrongLoginException - пользовательские классы исключения с двумя
конструкторами – один по умолчанию, второй принимает сообщение исключения и передает его
в конструктор класса Exception.
Метод возвращает true, если значения верны или false в другом случае.
Вывести на консоль причину, по которой вернулось false

 */
public class Validator {

    public static boolean validate (String login, String password, String confirmPassword)
            throws WrongLoginException, WrongPasswordException {
        try {
            if (login.length() >= 20 || login.contains(" ")) {
                throw new WrongLoginException("The login must be less than 20 characters and contain no space");
            }

            if (password.length() >= 20 || password.contains(" ") || !password.contains("1")) {
                throw new WrongPasswordException("The password must be less than 20 characters long, " +
                        "contain the digit '1' and contain no spaces");
            }

            if (!password.equals(confirmPassword)) {
                throw new WrongPasswordException("The password and the confirmation password do not match");
            }

            return true;
        } catch (WrongLoginException | WrongPasswordException e) {
            System.out.println("Error: " + e.getMessage());
            return false;
        }
    }
}
