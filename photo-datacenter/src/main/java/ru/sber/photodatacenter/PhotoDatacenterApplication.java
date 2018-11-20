package ru.sber.photodatacenter;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
//import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
//@EnableEurekaClient
//@ComponentScan({"ru.sber.photocommon.**", "ru.sber.photodatacenter.**"})
public class PhotoDatacenterApplication {

    public static void main(String[] args) {
        SpringApplication.run(PhotoDatacenterApplication.class, args);
    }
}
