package ru.geekbrains.spring1.lesson1.notspring;

public class Camera {
    private CameraRoll cameraRoll;

    public void setCameraRoll(CameraRoll cameraRoll) {
        this.cameraRoll = cameraRoll;
    }

    public void doPhotograph() {
        System.out.println("Щелк!!!");
        cameraRoll.processing();
    }
}
