package com.security;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by lizj on 2018/9/6.
 */
@SpringBootApplication
@RestController
public class DemoApplication {
    public static void main(String[] args ){
        SpringApplication.run(DemoApplication.class);
    }

    @GetMapping("/hello")
    public String hello(){
        return "hello security";
    }
}
