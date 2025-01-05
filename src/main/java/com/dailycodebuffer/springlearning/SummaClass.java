package com.dailycodebuffer.springlearning;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SummaClass {
    @Bean
    public String summa() {
        return "Summa";
    }
}
