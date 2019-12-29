package ru.sberdyshev.learn.geekbrains.java.spring.web.lesson1.classwork.annotationconfig;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("camera")
public class CameraImp implements Camera {
    private CameraRoll cameraRoll;

    public CameraImp(CameraRoll cameraRoll) {
        this.cameraRoll = cameraRoll;
    }

    public CameraImp() {
    }

    public CameraRoll getCameraRoll() {
        return cameraRoll;
    }

    @Autowired
    @Qualifier("BlackAndWhiteCameraRoll")
//    @Qualifier("colorCameraRoll")
    public void setCameraRoll(CameraRoll cameraRoll) {
        this.cameraRoll = cameraRoll;
    }

    public void doPhotograph() {
        System.out.println("Щелк!");
        cameraRoll.processing();
    }
}
