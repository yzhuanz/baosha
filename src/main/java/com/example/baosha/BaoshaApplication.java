package com.example.baosha;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.example.baosha.mapper")
public class BaoshaApplication {

    public static void main(String[] args) {
        SpringApplication.run(BaoshaApplication.class, args);
    }

}
