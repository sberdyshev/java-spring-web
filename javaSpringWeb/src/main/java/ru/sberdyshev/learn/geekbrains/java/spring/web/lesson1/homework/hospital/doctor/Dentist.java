package ru.sberdyshev.learn.geekbrains.java.spring.web.lesson1.homework.hospital.doctor;

//@Component("Dentist")
public class Dentist extends DoctorImpl {

    public void cure() {
        System.out.println("Your teeth are good now!");
    }
}
