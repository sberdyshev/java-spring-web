package ru.geekbrains.spring1.lesson1.xmlconfig;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("configCamera.xml");
        Camera camera = context.getBean("camera", Camera.class);
        camera.doPhotograph();

    }
}
