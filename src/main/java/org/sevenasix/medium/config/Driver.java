package org.sevenasix.medium.config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackageClasses = {RootConfig.class, WebConfig.class})
public class Driver {
    public static void main(String[] args) {
        SpringApplication.run(new Object[]{Driver.class}, args);
    }
}
