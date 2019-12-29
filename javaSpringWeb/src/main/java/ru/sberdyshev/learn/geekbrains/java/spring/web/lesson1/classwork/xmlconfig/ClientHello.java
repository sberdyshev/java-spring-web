package ru.geekbrains.spring1.lesson1.xmlconfig;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ClientHello {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("configHello.xml");
        HelloMan hm = context.getBean("helloman", HelloMan.class);
        hm.helloSay();
    }
}


