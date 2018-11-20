package ru.sber.photoeureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class PhotoEurekaApplication {
    public static void main(String[] args) {
        SpringApplication.run(PhotoEurekaApplication.class, args);
    }
}
