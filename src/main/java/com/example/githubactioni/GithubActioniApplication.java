package com.example.githubactioni;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class GithubActioniApplication {

    public static void main(String[] args) {
        var obj = Math.abs(5.5);
        System.out.println(obj);
        SpringApplication.run(GithubActioniApplication.class, args);
    }

}
