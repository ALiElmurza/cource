package atestat1.task4;

import java.util.Random;
import java.util.Scanner;

public class GameRockPaperScissors {

    private static Integer player = 0;
    private static Integer computer = 0;

    public static void main(String[] args) {
        for(int i = 0; i < 5; i++) {
            System.out.println("------Round: " + getRound(i) + "------");
            Scanner scanner = new Scanner(System.in);
            String playerValue = scanner.nextLine();
            Game computerValue = getRandomValue();
            whoWon(playerValue, computerValue);
            System.out.println("Вы: " + playerValue + ", Копьютер: " + computerValue);
        }

        if (player > computer) {
            System.out.println("Поздравляем, вы победили! :)");
        } else System.out.println("Вы проиграли :(");

    }

    private static int getRound(int i) {
        return i + 1;
    }


    private static Game getRandomValue() {
        Game game = null;
        Random random = new Random();
        int value = random.nextInt(3) + 1;
        switch (value) {
            case 1:
                game = Game.getByCode(1);
                break;
            case 2:
                game = Game.getByCode(2);
                break;
            case 3:
                game = Game.getByCode(3);
                break;
            default:
                break;
        }
        return game;
    }

    private static void whoWon(String playerGame, Game computerGame) {
        Game playerEnum = Game.getByName(playerGame);
        if (playerEnum == Game.Н && computerGame == Game.Б ) {
            player += 2;
        } else if (playerEnum == Game.Б && computerGame == Game.Н ) {
            computer += 2;
        } else if (playerEnum == Game.К && computerGame == Game.Н ) {
            player += 1;
        } else if (playerEnum == Game.Н && computerGame == Game.К ) {
            computer += 2;
        } else if (playerEnum == Game.Б && computerGame == Game.К ) {
            player += 5;
        } else if (playerEnum == Game.К && computerGame == Game.Б ) {
            computer += 5;
        }
    }

    private enum Game {
        К(1),
        Н(2),
        Б(3);

        private final int code;

        Game(int code) {
            this.code = code;
        }

        public int getCode() {
            return this.code;
        }

        public static Game getByCode(int code) {
            for (Game game : Game.values()) {
                if (game.getCode() == code) {
                    return game;
                }
            }
            throw new IllegalArgumentException("Invalid code: " + code);
        }

        public static Game getByName(String name) {
            for (Game game : Game.values()) {
                if (game.name().equals(name)) {
                    return game;
                }
            }
            throw new IllegalArgumentException("Invalid name: " + name);
        }
    }
}
