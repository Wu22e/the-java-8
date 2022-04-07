package me.wu2ee.java8to11;

import java.util.function.Consumer;

public class Foo {

    public static void main(String[] args) {
        Consumer<Integer> printT = (i) -> System.out.println(i);
        printT.accept(10);
    }
}
