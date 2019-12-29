package ru.sberdyshev.learn.geekbrains.java.spring.web.lesson1.homework.hospital.doctor;

import org.springframework.stereotype.Component;

@Component("Physician")
public class Physician extends DoctorImpl {
    public void cure() {
        System.out.println("Your don't have fever from now on!");
    }
}
