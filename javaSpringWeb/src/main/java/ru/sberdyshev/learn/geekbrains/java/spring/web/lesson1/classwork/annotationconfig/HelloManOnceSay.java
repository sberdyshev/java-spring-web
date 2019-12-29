package ru.sberdyshev.learn.geekbrains.java.spring.web.lesson1.classwork.annotationconfig;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class HelloManOnceSay implements HelloMan {

    @Value("Jorick")
    private String name;

    public HelloManOnceSay() {
    }

    public HelloManOnceSay(String name) {
        this.name = name;
    }

    public void helloSay() {
        System.out.println("Hello " + name);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
