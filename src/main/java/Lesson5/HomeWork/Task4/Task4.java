package Lesson5.HomeWork.Task4;

public class Task4 {
    public static void main(String[] args) throws Exception {
        String password = "отомыu90u$вм";
        if (password.length() < 8) {
            throw new Exception("Пароль менее 8 символов");
        } else if (
                !password.contains("0") &&
                        !password.contains("1") &&
                        !password.contains("2") &&
                        !password.contains("3") &&
                        !password.contains("4") &&
                        !password.contains("5") &&
                        !password.contains("6") &&
                        !password.contains("7") &&
                        !password.contains("8") &&
                        !password.contains("9")) {
            throw new Exception("Пароль должен содержить число");
        } else if (
                !password.contains("!") &&
                        !password.contains("@") &&
                        !password.contains("#") &&
                        !password.contains("$") &&
                        !password.contains("%") &&
                        !password.contains(".") &&
                        !password.contains("&") &&
                        !password.contains("*") &&
                        !password.contains("№")) {
            throw new Exception ("Пароль должен содержать минимум 1 из спецсимволов (!, @, #, $, %, ., &, *, №)");
        } else {
            System.out.println("Пароль принят");
        }
    }
}

