package ru.geekbrains.spring1.lesson1.annotationconfig;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ClientHelloMan {

    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        HelloMan helloMan = context.getBean(HelloMan.class);
        helloMan.helloSay();
    }
}
