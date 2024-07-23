package Lesson6.HomeWork.Task4;

import java.util.*;

public class Company {
    String name;
    String year;
    List<String> films =  new ArrayList<>();

    public Company(String name, String year) {
        this.name = name;
        this.year = year;
        this.films =  new ArrayList<>();
    }
}
