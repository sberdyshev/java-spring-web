package ru.sberdyshev.learn.geekbrains.java.spring.web.lesson1.classwork.annotationconfig;

import org.springframework.stereotype.Component;

@Component("BlackAndWhiteCameraRoll")
public class BlackAndWhiteCameraRoll implements CameraRoll {

    public void processing() {
        System.out.println("- 1 черно-белый кадр!");
    }
}
