package me.wu2ee.java8to11;

import java.util.ArrayList;
import java.util.List;

public class App {

    public static void main(String[] args) {
        List<String> name = new ArrayList<>();
        name.add("wu2ee");
        name.add("pobi");
        name.add("honux");
        name.add("foo");

        long k = name.stream().map(String::toUpperCase)
                .filter(s -> s.startsWith("W"))
                .count();

        System.out.println(k);
    }
}
