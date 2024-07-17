package atestat1.task1;

import java.util.Scanner;

public class ILoveYou {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long inputLong = scanner.nextLong();
        System.out.println(calculator(inputLong));
    }

    private static String calculator(long centimeters) {
        int constant = 15 / 3 * 62 + (3 * 12);
        if (centimeters >= constant) {
            return "Достаточно места для признания в любви на заборе :)";
        } else {
            return "Недостаточно места для признания в любви на заборе :(";
        }
    }
}
