package ru.sberdyshev.learn.geekbrains.java.spring.web.lesson1.homework.hospital;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import ru.sberdyshev.learn.geekbrains.java.spring.web.lesson1.homework.config.AppConfig;

import static ru.sberdyshev.learn.geekbrains.java.spring.web.lesson1.homework.hospital.doctor.DoctorType.PHYSICIAN;
import static ru.sberdyshev.learn.geekbrains.java.spring.web.lesson1.homework.hospital.doctor.DoctorType.DENTIST;

public class Patient {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        Registry registry = context.getBean("registry", Registry.class);
        registry.issueDirection(PHYSICIAN);
        registry.issueDirection(DENTIST);
    }
}
