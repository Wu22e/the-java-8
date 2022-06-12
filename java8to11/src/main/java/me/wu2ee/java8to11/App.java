package me.wu2ee.java8to11;

import java.util.ArrayList;
import java.util.List;

public class App {

    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("wu2ee");
        names.add("pobi");
        names.add("honux");
        names.add("foo");

        names.stream().map(s -> {
            System.out.println(s);
            return s.toUpperCase();
        });

        System.out.println("=============");

        names.forEach(System.out::println);
    }
}
