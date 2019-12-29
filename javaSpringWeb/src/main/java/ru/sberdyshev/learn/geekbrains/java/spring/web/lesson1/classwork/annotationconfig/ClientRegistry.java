package ru.geekbrains.spring1.lesson1.annotationconfig;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ClientRegistry {
    public static void main(String[] args) {
        ApplicationContext context=new AnnotationConfigApplicationContext(AppConfig.class);
        Registry registry = context.getBean("Registry",Registry.class );
        registry.issueDirection();
    }
}
