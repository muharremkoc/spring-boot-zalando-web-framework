package com.example.springbootexceptionhandlingwithzalando;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.web.servlet.error.ErrorMvcAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
public class SpringBootExceptionHandlingWithZalandoApplication {

    public static void main(String[] args) {
        System.setProperty("spring.profiles.active", "springbootexceptionhandlingwithzalando");
        SpringApplication.run(SpringBootExceptionHandlingWithZalandoApplication.class, args);
    }

}
