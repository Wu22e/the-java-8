package me.wu2ee.java8to11;

import java.util.function.Supplier;
import java.util.function.UnaryOperator;

public class Foo {

    public static void main(String[] args) {
        Greeting greeting = new Greeting();
        UnaryOperator<String> hello = greeting::hello;
        System.out.println(hello.apply("wu2ee"));
    }
}
