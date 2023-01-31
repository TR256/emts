package com.emts.launch;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.emts")
@MapperScan("com.emts.dao")
public class LaunchApplication {

    public static void main(String[] args) {
        SpringApplication.run(LaunchApplication.class, args);
    }

}
