package ru.geekbrains.spring1.lesson1.xmlconfig;

public class ColorCameraRoll implements CameraRoll {
    @Override
    public void processing() {
        System.out.println("- 1 цветной кадр!");
    }
}
