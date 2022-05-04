package me.wu2ee.java8to11;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class App {

    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("wu2ee");
        names.add("pobi");
        names.add("honux");
        names.add("foo");

        Stream<String> stringStream = names.stream().map(String::toUpperCase);

        names.forEach(System.out::println);
    }
}
