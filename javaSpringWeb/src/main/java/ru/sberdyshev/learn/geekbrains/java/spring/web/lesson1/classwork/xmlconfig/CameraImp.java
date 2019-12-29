package ru.geekbrains.spring1.lesson1.xmlconfig;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

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

    public void setCameraRoll(CameraRoll cameraRoll) {
        this.cameraRoll = cameraRoll;
    }

    public void doPhotograph() {
        System.out.println("Щелк!");
        cameraRoll.processing();
    }
}
