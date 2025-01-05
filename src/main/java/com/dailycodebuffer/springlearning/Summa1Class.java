package com.dailycodebuffer.springlearning;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Summa1Class {
    @Bean
    public String summa() {
        return "Summa1";
    }
}
