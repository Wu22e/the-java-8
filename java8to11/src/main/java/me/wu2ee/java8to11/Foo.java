package me.wu2ee.java8to11;

import java.util.function.Function;
import java.util.function.UnaryOperator;

public class Foo {

    public static void main(String[] args) {
        UnaryOperator<String> hi1 = (s) -> "hi " + s;
        UnaryOperator<String> hi2 = Greeting::hi;
    }
}
