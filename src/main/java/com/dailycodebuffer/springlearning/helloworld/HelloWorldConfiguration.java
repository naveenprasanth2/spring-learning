package com.dailycodebuffer.springlearning.helloworld;

import lombok.Getter;
import org.springframework.beans.factory.annotation.Qualifier;
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
    public Person person(String name, int age, @Qualifier("address1") Address address) {
        return new Person(name, age, address);
    }

    @Bean
    public Address address() {
        return new Address("Baker Street", "London");
    }

    @Bean
    public Address address1() {
        return new Address("Baker Street1", "London1");
    }
}