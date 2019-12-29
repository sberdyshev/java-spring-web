package ru.sberdyshev.learn.geekbrains.java.spring.web.lesson1.classwork.annotationconfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("ru.geekbrains.spring1.lesson1.annotationconfig")
public class AppConfig {
//    @Bean(name = "cameraRoll")
//    public CameraRoll cameraRoll() {
//        return new ColorCameraRoll();
//    }
//
//    @Bean(name = "camera")
//    public Camera camera(CameraRoll cameraRoll) {
//        CameraImp camera = new CameraImp();
//        camera.setCameraRoll(cameraRoll);
//        return camera;
//    }
}
