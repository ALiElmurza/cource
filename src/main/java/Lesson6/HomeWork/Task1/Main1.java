package Lesson6.HomeWork.Task1;

public class Main1 {
    public static void main(String[] args) {
        Player player1 = new Player(1, "bmw", true);
        Player player2 = new Player(1, "bmw", true);
        System.out.println(player2==player1);
        System.out.println(player1.equals(player2));

    }
}
