package com.dailycodebuffer.springlearning.demo;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;

@Configuration
@ComponentScan(excludeFilters = {@ComponentScan.Filter(
        value = MarioGame.class,
        type = FilterType.ASSIGNABLE_TYPE
)})
@EnableAutoConfiguration
public class GamingApplication {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(GamingApplication.class);
        MarioGame marioGame = (MarioGame) context.getBean("marioGame");
        marioGame.down();
    }
}
