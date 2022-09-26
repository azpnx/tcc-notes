package com.example.psinotes;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class PsiNotesApplication {

    public static void main(String[] args) {
        SpringApplication.run(PsiNotesApplication.class, args);
    }

}
