package ru.geekbrains.spring1.lesson1.annotationconfig;

import org.springframework.stereotype.Component;
import ru.sberdyshev.learn.geekbrains.java.spring.web.lesson1.classwork.annotationconfig.CameraRoll;

@Component("colorCameraRoll")
public class ColorCameraRoll implements CameraRoll {

    public void processing() {
        System.out.println("- 1 цветной кадр!");
    }
}
