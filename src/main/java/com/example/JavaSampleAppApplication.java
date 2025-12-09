package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.*;

@SpringBootApplication
@RestController
public class JavaSampleAppApplication {

    public static void main(String[] args) {
        SpringApplication.run(JavaSampleAppApplication.class, args);
    }

    @GetMapping("/")
    public String hello() {
        return "Hello from Java Sample App!";
    }
}
