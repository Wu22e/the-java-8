package me.wu2ee.java8to11;

import java.util.function.BinaryOperator;
import java.util.function.Supplier;
import java.util.function.UnaryOperator;

public class Foo {

    public static void main(String[] args) {
        Supplier<Integer> get10Type1 = () -> 10;
        Supplier<Integer> get10Type2 = () -> {
            return 10;
        };
        BinaryOperator<Integer> sumType1 = (a, b) -> a + b;
        BinaryOperator<Integer> sumType2 = (Integer a, Integer b) -> a + b;

        UnaryOperator<Integer> plus10 = (i) -> i + 10;
        UnaryOperator<Integer> multiply2 = (i) -> i * 2;
        System.out.println(plus10.andThen(multiply2).apply(2));
    }
}
