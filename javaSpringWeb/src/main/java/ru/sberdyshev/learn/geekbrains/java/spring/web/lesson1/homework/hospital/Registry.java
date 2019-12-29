package ru.sberdyshev.learn.geekbrains.java.spring.web.lesson1.homework.hospital;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import ru.sberdyshev.learn.geekbrains.java.spring.web.lesson1.homework.hospital.doctor.DoctorImpl;
import ru.sberdyshev.learn.geekbrains.java.spring.web.lesson1.homework.hospital.doctor.DoctorType;

@Component
public class Registry {
    @Autowired
    @Qualifier("Dentist")
    private DoctorImpl dentist;
    @Autowired
    @Qualifier("Physician")
    private DoctorImpl physician;

    public void issueDirection(DoctorType doctor) {
        if (doctor == DoctorType.PHYSICIAN) {
            System.out.println("Go to the room " + dentist.getRoom());
            dentist.cure();
        } else if (doctor == DoctorType.DENTIST) {
            System.out.println("Go to the room " + physician.getRoom());
            physician.cure();
        } else {
            System.out.println("There is no such doctor at our hospital");
        }
    }
}
