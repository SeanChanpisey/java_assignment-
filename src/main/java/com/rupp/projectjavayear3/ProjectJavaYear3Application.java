package com.rupp.projectjavayear3;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication
@EntityScan(basePackages = "com.rupp.projectjavayear3.models")
public class ProjectJavaYear3Application {
    public static void main(String[] args) {
        SpringApplication.run(ProjectJavaYear3Application.class, args);
    }
}
