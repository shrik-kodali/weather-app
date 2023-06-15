package com.ai.weather;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.cloud.openfeign.EnableFeignClients;


/**
 * Spring Boot Application
 */
@Configuration
@EntityScan(basePackages = { "com.ai.weather.*" })
@ComponentScan(basePackages = { "com.ai.weather" })
@EnableFeignClients
@SpringBootApplication
public class WeatherApplication {
    public static void main(String[] args) {
        SpringApplication.run(WeatherApplication.class, args);
    }
}
