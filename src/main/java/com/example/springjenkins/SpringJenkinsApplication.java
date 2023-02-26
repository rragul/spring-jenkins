package com.example.springjenkins;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SpringJenkinsApplication {

    @GetMapping("/")
    public String displayMessage(){
        return "Jenkins demo";
    }
    public static void main(String[] args) {
        SpringApplication.run(SpringJenkinsApplication.class, args);
    }

}
