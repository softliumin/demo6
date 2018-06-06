package com.example.demo6server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ImportResource;

@ImportResource({ "classpath*:sofa-config.xml" })
@SpringBootApplication
public class Demo6ServerApplication {

    public static void main(String[] args) {
//        SpringApplication.run(Demo6ServerApplication.class, args);

        SpringApplication springApplication = new SpringApplication(Demo6ServerApplication.class);
        springApplication.run(args);
    }
}
