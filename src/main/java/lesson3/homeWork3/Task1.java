package lesson3.homeWork3;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner cardNumber = new Scanner(System.in);
        String cardNumber1 = cardNumber.nextLine();
        System.out.println("**** **** **** " + cardNumber1.substring(cardNumber1.length() - 4));

    }


    }

