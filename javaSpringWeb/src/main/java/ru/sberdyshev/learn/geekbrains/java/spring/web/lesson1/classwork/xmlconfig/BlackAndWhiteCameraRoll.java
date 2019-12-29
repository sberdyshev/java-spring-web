package ru.geekbrains.spring1.lesson1.xmlconfig;

public class BlackAndWhiteCameraRoll implements CameraRoll {
    @Override
    public void processing() {
        System.out.println("- 1 черно-белый кадр!");
    }
}
