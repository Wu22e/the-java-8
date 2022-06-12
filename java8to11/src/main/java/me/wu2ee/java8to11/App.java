package me.wu2ee.java8to11;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class App {

    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("wu2ee");
        names.add("pobi");
        names.add("honux");
        names.add("foo");

        List<String> collect = names.stream().map(s -> {
            System.out.println(s);
            return s.toUpperCase();
        }).collect(Collectors.toList());

        System.out.println("=============");

        names.forEach(System.out::println);
    }
}
