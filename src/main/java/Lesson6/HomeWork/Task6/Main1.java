package Lesson6.HomeWork.Task6;

import Lesson6.HomeWork.Task1.Player;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main1 {
    public static void main(String[] args) {
        Map<Player, Integer> points = new HashMap<>();
        points.put(new Player(1, "Олег1", true), 17);
        points.put(new Player(2, "Олег2", true), 16);
        points.put(new Player(3, "Олег3", true), 15);
        points.put(new Player(4, "Олег4", true), 40);
        points.put(new Player(5, "Олег5", true), 10);
        points.put(new Player(6, "Олег6", true), 9);
        points.put(new Player(7, "Олег7", true), 12);
        points.put(new Player(8, "Олег8", true), 11);
        points.put(new Player(9, "Олег9", true), 14);
        points.put(new Player(10, "Олег10", true), 5);

        Player player1 = null;
        Player player2 = null;
        Player player3 = null;

        Integer player_1 = 0;
        Integer player_2 = 0;
        Integer player_3 = 0;

        for (int i = 0; i < points.size(); i++) {
            for (Map.Entry<Player, Integer> entry : points.entrySet()) {
                int point = entry.getValue();
                Player entryPlayer = entry.getKey();
                if (point > player_1) {
                    player_1 = point;
                    player1 = entryPlayer;
                }
                if (point > player_2 && point < player_1) {
                    player_2 = point;
                    player2 = entryPlayer;
                }
                if (point > player_3 && point < player_1 && point < player_2){
                    player_3 = point;
                    player3 = entryPlayer;
                };

            }
        }

        System.out.println(player1.toString());
        System.out.println(player2.toString());
        System.out.println(player3.toString());
    }
}
