package me.wu2ee.java8to11;

import java.util.function.UnaryOperator;

public class Foo {

    public static void main(String[] args) {
        Greeting greeting = new Greeting();
        UnaryOperator<String> hello = greeting::hello;
    }
}
