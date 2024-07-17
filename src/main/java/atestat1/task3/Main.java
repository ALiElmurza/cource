package atestat1.task3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Integer[] array = {9,5,8,9, 9, 2,0,4,9,6};
        List<Integer> array2 = Arrays.asList(array);
        array2.sort(Comparator.comparingInt(x -> x));

        for (int i = array2.size()-1; i > 0; i--) {
            if (array2.get(i) == array2.get(i-1)) {
                //ignore
            } else {
                System.out.println(array2.get(i-1));
                break;
            }
        }
    }
}
