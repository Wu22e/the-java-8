package me.wu2ee.java8to11;

public class Foo {

    public static void main(String[] args) {
        RunSomething runSomething = new RunSomething() {
            int baseNumber = 10;

            @Override
            public int doIt(int number) {
                baseNumber++;
                return number + baseNumber;
            }
        };
    }
}
