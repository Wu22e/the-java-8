package me.wu2ee.java8to11;

import java.util.Arrays;

public class App {

    public static void main(String[] args) {
        String[] names = {"wu2ee", "pobi", "honux"};
        Arrays.sort(names, (o1, o2) -> o1.compareToIgnoreCase(o2));
        System.out.println(Arrays.toString(names));
    }
}
