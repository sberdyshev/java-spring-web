package ru.sberdyshev.learn.geekbrains.java.spring.web.lesson1.classwork.annotationconfig;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import ru.sberdyshev.learn.geekbrains.java.spring.web.lesson1.homework.config.AppConfig;

public class ClientRegistry {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        Registry registry = context.getBean("Registry", Registry.class);
        registry.issueDirection();
    }
}
