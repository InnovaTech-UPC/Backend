package com.agrotech.api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class AgrotechApplication {

    public static void main(String[] args) {
        SpringApplication.run(AgrotechApplication.class, args);
    }

}
