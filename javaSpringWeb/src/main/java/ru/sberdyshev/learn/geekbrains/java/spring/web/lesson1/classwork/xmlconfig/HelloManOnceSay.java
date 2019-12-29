package ru.geekbrains.spring1.lesson1.xmlconfig;

public class HelloManOnceSay implements HelloMan{

    private String name;

    public HelloManOnceSay(String name) {
        this.name = name;
    }

    public HelloManOnceSay() {
    }

    @Override
    public void helloSay() {
        System.out.println("Hello " + name);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
