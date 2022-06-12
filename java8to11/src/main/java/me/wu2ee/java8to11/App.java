package me.wu2ee.java8to11;

import java.util.function.Function;
import java.util.function.Supplier;

public class App {

    public static void main(String[] args) {
        Function<String, Greeting> wu2eeGreeting
                = Greeting::new;
        Greeting wu2ee = wu2eeGreeting.apply("wu2ee");
        System.out.println(wu2ee.getName());

        Supplier<Greeting> newGreeting = Greeting::new;
    }
}
