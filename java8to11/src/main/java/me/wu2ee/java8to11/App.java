package me.wu2ee.java8to11;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class App {

    public static void main(String[] args) {
        List<OnlineClass> springClasses = new ArrayList<>();
        springClasses.add(new OnlineClass(1, "spring boot", true));
        springClasses.add(new OnlineClass(5, "rest api development", false));

        Optional<OnlineClass> optional = springClasses.stream()
                .filter(oc -> oc.getTitle().startsWith("spring"))
                .findFirst();

        Optional<OnlineClass> onlineClass1 =
                optional.filter(oc -> !oc.isClosed());
        Optional<OnlineClass> onlineClass2 =
                optional.filter(oc -> oc.isClosed());

        System.out.println(onlineClass1.isEmpty());
        System.out.println(onlineClass2.isEmpty());
    }

    private static OnlineClass createNewClass() {
        System.out.println("creating new online class");
        return new OnlineClass(10, "New class", false);
    }
}
