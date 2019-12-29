package ru.geekbrains.spring1.lesson1.notspring;

public class Client {
    public static void main(String[] args) {
        Assistenta assistenta = new Assistenta();
        Camera camera = assistenta.getCamera();
        camera.doPhotograph();
    }
}
