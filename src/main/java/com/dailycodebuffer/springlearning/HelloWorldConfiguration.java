package com.dailycodebuffer.springlearning;

import lombok.Getter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@Getter
@ComponentScan
public class HelloWorldConfiguration {
    @Autowired
    public String summa;

    @Bean
    public String name() {
        return "Hello World";
    }
}
