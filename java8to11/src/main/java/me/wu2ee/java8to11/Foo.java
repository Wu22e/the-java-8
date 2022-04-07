package me.wu2ee.java8to11;

import java.util.function.Predicate;

public class Foo {

    public static void main(String[] args) {
        Predicate<String> startsWithHyungwoo = (s) -> s.startsWith("hyungwoo");
        Predicate<Integer> isEven = (i) -> i % 2 == 0;
    }
}
