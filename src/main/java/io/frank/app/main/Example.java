package io.frank.app.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

/**
 * @author : Frank F
 * @ClassName: Example
 * @Descripsion :
 * @Date : 2019-08-21 23:09
 * @Version :  0.0.1
 */

@SpringBootApplication
@EnableScheduling
public class Example {
    public static void main(String[] args) {
        SpringApplication.run(Example.class, args);
    }
}
