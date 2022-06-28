package me.wu2ee.java8to11;

import java.util.ArrayList;
import java.util.List;

public class App {

    public static void main(String[] args) {
        List<OnlineClass> springClasses = new ArrayList<>();
        springClasses.add(new OnlineClass(1, "spring boot", true));
        springClasses.add(new OnlineClass(2, "spring data jpa", true));
        springClasses.add(new OnlineClass(3, "spring mvc", false));
        springClasses.add(new OnlineClass(4, "spring core", false));
        springClasses.add(new OnlineClass(5, "rest api development", false));

        OnlineClass onlineClass = new OnlineClass(1, "spring boot", true);
        Progress progress = onlineClass.getProgress().get();
        if (progress != null) {
            System.out.println(progress.getStudyDuration());
        }
    }
}
