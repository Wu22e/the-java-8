package me.wu2ee.java8to11;

public class Foo {

    public static void main(String[] args) {
        // 익명 내부 클래스 anonymous inner class
        RunSomething runSomething1 = new RunSomething() {
            @Override
            public void doIt() {
                System.out.println("Hello1");
            }
        };

        runSomething1.doIt();

        // 추상 메서드가 하나일때 (함수형 인터페이스 일때) 위의 익명 내부 클래스를 더 줄여쓸 수 있는 방법을 자바 8에서 제공. (람다 표현식)
        // 자바에서 함수는 특수한 오브젝트 형식으로 생각하면 된다. (함수형 인터페이스를 인라인으로 구현한 오브젝트)
        RunSomething runSomething2 = () -> System.out.println("Hello2");
        runSomething2.doIt();
    }
}
