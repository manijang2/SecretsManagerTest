package com.example;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.annotation.PostConstruct;

@SpringBootApplication
public class SecretsManagerTestApplication {

    @Value("${cloud.aws.credentials.access-key}")
    private String test;

    @Value("${test.value}")
    private String test2;

    @PostConstruct
    void test() {
        System.out.println("test = " + test);
        System.out.println("test2 = " + test2);
    }

    public static void main(String[] args) {
        SpringApplication.run(SecretsManagerTestApplication.class, args);
    }

}
