package Lesson5.HomeWork.Task2andTask3;

public class Main1 {
    public static void main(String[] args) {
        int x = 5;
        if (x % 2 == 0 && x % 4 == 0) {
            System.out.println("Четное число. Кратно четырем");
        } else if (x % 2 != 0 && x % 3 == 0) {
            System.out.println("Нечетное число.Кратно .");
        }
    }
}
