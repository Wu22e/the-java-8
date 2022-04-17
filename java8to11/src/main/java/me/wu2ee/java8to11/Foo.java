package me.wu2ee.java8to11;

import java.util.function.Consumer;
import java.util.function.IntConsumer;

public class Foo {

    public static void main(String[] args) {
        Foo foo = new Foo();
        foo.run();
    }

    private void run() {
        final int baseNumber = 10;

        // 람다
        IntConsumer printInt = (baseNumber) -> {
            System.out.println(baseNumber);
        };

        printInt.accept(10);
    }
}
