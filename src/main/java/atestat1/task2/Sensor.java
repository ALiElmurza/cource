package atestat1.task2;

import java.util.Random;

public class Sensor {

    public static void main(String[] args) {
        // test
        System.out.println(moisture());
    }

    public static Integer moisture() {
        Random random = new Random();
        return random.nextInt(100) + 1;
    }
}
