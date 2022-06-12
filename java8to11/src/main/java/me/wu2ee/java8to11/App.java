package me.wu2ee.java8to11;

import java.util.Arrays;
import java.util.Comparator;

public class App {

    public static void main(String[] args) {
        String[] names = {"wu2ee", "pobi", "honux"};
        Arrays.sort(names, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.compareToIgnoreCase(o2);
            }
        });
        System.out.println(Arrays.toString(names));
    }
}
