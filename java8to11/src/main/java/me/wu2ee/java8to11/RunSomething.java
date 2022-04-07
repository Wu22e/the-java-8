package me.wu2ee.java8to11;

@FunctionalInterface // 함수형 인터페이스임을 명시. 추상메서드가 2개가 되면 컴파일 에러를 뱉음.
public interface RunSomething {
    // 추상 메서드 (인터페이스에서는 abstract 키워드 생략 가능)
    int doIt(int number);

    // 자바 8 부터 인터페이스에 static 메서드 정의 가능
    static void printName() {
        System.out.println("hyungwoo");
    }

    // default 메서드 정의 가능
    default void printAge() {
        System.out.println("28");
    }

    // 위와 같이 다른 형태의 메서드가 여러개 있더라도 반드시 추상메서드가 1개가 있어야 함수형 인터페이스라고 한다.
}
