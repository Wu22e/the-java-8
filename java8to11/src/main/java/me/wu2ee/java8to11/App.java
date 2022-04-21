package me.wu2ee.java8to11;

import java.util.ArrayList;
import java.util.List;
import java.util.Spliterator;

public class App {

    public static void main(String[] args) {
        List<String> name = new ArrayList<>();
        name.add("wu2ee");
        name.add("pobi");
        name.add("honux");
        name.add("foo");

        Spliterator<String> spliterator = name.spliterator();
        Spliterator<String> spliterator1 = spliterator.trySplit();
        System.out.println("spliterator : ");
        while (spliterator.tryAdvance(System.out::println));
        System.out.println("spliterator1 : ");
        while (spliterator1.tryAdvance(System.out::println));
    }
}
