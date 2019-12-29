package ru.sberdyshev.learn.geekbrains.java.spring.web.lesson1.homework.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import ru.sberdyshev.learn.geekbrains.java.spring.web.lesson1.homework.hospital.doctor.Dentist;
import ru.sberdyshev.learn.geekbrains.java.spring.web.lesson1.homework.hospital.doctor.DoctorImpl;
import ru.sberdyshev.learn.geekbrains.java.spring.web.lesson1.homework.hospital.doctor.Physician;

@Configuration
@ComponentScan("ru.sberdyshev.learn.geekbrains.java.spring.web.lesson1.homework")
public class AppConfig {
    @Bean(name = "Dentist")
    public DoctorImpl dentist(@Value("518") int room) {
        DoctorImpl dentist = new Dentist();
        dentist.setRoom(room);
        return dentist;
    }

    @Bean(name = "Physician")
    public DoctorImpl physician(@Value("523") int room) {
        DoctorImpl physician = new Physician();
        physician.setRoom(room);
        return physician;
    }
}
