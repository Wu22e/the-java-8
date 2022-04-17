package me.wu2ee.java8to11;

import java.util.function.IntConsumer;

public class Foo {

    public static void main(String[] args) {
        Foo foo = new Foo();
        foo.run();
    }

    private void run() {
        int baseNumber = 10;

        // 람다
        IntConsumer printInt = (i) -> {
            System.out.println(i + baseNumber);
        };
        baseNumber++;

        printInt.accept(10);
    }
}
