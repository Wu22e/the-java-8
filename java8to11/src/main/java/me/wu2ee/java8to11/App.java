package me.wu2ee.java8to11;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class App {

    public static void main(String[] args) {
        List<OnlineClass> springClasses = new ArrayList<>();
        springClasses.add(new OnlineClass(1, "spring boot", true));
        springClasses.add(new OnlineClass(5, "rest api development", false));

        Optional<OnlineClass> spring = springClasses.stream()
                .filter(oc -> oc.getTitle().startsWith("spring"))
                .findFirst();

        Optional<OnlineClass> jpa = springClasses.stream()
                .filter(oc -> oc.getTitle().startsWith("jpa"))
                .findFirst();

        System.out.println(spring.isPresent());
        System.out.println(spring.isEmpty());
        System.out.println(jpa.isPresent());
        System.out.println(jpa.isEmpty());
    }
}
