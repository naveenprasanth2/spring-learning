package com.dailycodebuffer.springlearning.test;

import lombok.Getter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@Getter
@ComponentScan
public class HelloWorldConfiguration {
    @Bean
    public String name() {
        return "Ranga";
    }

    @Bean
    public int age() {
        return 15;
    }

    @Bean
    public Person person(String name, int age, Address address) {
        return new Person(name, age, address);
    }

    @Bean
    public Address address() {
        return new Address("Baker Street", "London");
    }
}