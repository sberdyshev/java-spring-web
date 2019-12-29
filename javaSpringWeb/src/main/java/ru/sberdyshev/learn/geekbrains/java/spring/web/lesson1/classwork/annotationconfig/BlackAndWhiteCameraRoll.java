package ru.geekbrains.spring1.lesson1.annotationconfig;

import org.springframework.stereotype.Component;

@Component("BlackAndWhiteCameraRoll")
public class BlackAndWhiteCameraRoll implements CameraRoll {
    @Override
    public void processing() {
        System.out.println("- 1 черно-белый кадр!");
    }
}
