package ru.sberdyshev.learn.geekbrains.java.spring.web.lesson1.classwork.annotationconfig;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import ru.sberdyshev.learn.geekbrains.java.spring.web.lesson1.classwork.annotationconfig.AppConfig;

public class Client {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        Camera camera = context.getBean("camera", Camera.class);
        camera.doPhotograph();
    }
}
