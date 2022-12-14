package com.example.springcloudfeignbookserviceapplication;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class SpringCloudFeignBookServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringCloudFeignBookServiceApplication.class, args);
    }

}
