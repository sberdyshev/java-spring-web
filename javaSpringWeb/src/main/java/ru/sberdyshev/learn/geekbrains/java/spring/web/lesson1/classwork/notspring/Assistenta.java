package ru.geekbrains.spring1.lesson1.notspring;

public class Assistenta {

    public Camera getCamera(){
        CameraRoll cameraRoll = new ColorCameraRoll();
        Camera camera = new Camera();
        camera.setCameraRoll(cameraRoll);
        return camera;
    }

}
