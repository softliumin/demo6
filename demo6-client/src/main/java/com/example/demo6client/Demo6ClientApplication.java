package com.example.demo6client;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

@ImportResource({ "classpath*:sofa-config.xml" })
@SpringBootApplication
public class Demo6ClientApplication {

    public static void main(String[] args) {
        SpringApplication.run(Demo6ClientApplication.class, args);
    }
}
