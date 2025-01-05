package com.dailycodebuffer.springlearning;

import org.apache.catalina.core.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App02HelloWorldSpring {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext
                (HelloWorldConfiguration.class);
//        System.out.println(applicationContext.getBean("name"));
        System.out.println(applicationContext.getBean(HelloWorldConfiguration.class).summa);
    }
}
