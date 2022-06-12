package me.wu2ee.java8to11;

import java.util.Arrays;

public class App {

    public static void main(String[] args) {
        String[] names = {"wu2ee", "pobi", "honux"};
        Arrays.sort(names, String::compareToIgnoreCase);
        System.out.println(Arrays.toString(names));
    }
}
