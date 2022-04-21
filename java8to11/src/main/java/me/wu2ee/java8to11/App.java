package me.wu2ee.java8to11;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class App {

    public static void main(String[] args) {
        List<String> name = new ArrayList<>();
        name.add("wu2ee");
        name.add("pobi");
        name.add("honux");
        name.add("foo");

        Comparator<String> compareToIgnoreCase = String::compareToIgnoreCase;
        name.sort(compareToIgnoreCase.reversed());

        name.forEach(System.out::println);
    }
}
