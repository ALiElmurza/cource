package Lesson6.HomeWork.Task2;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
         List<String> list = new ArrayList<>();
         list.add("Пойти в зал");
         list.add("Пройти занятия java");
         list.add("Поработать");
         list.add("Погладить кота");
         list.add("Покушать");

         for (int i = 1; i <= list.size(); i++ ) {
             System.out.println("Задача " + i + ": "+ list.get(i-1));
         }
    }
}
