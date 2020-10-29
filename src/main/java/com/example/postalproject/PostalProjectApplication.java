package com.example.postalproject;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.example.postalproject.mapper")
public class PostalProjectApplication {

    public static void main(String[] args) {
        SpringApplication.run(PostalProjectApplication.class, args);
    }

}
