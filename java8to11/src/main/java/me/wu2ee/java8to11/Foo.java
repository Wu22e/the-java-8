package me.wu2ee.java8to11;

import java.util.function.Supplier;

public class Foo {

    public static void main(String[] args) {
        Supplier<Greeting> newGreeting = Greeting::new;
        Greeting greeting = newGreeting.get(); // 인스턴스화
    }
}
