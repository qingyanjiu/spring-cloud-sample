package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@EnableDiscoveryClient
@RestController
public class DemoApplication {

    @Autowired
    private Environment environment;

    @RequestMapping("/hello")
    public Object hello() {
        if (environment.getActiveProfiles()[0].equalsIgnoreCase("dev")) {
            return "hello , from instance-1";
        } else {
            return "hello , from instance-2";
        }
    }

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }
}
