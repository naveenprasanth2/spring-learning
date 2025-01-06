package com.dailycodebuffer.springlearning.helloworld;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App02HelloWorldSpring {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext
                (HelloWorldConfiguration.class);
        System.out.println(applicationContext.getBean("name"));
        System.out.println(applicationContext.getBean("age"));
        System.out.println(applicationContext.getBean("person"));
        System.out.println(applicationContext.getBean("address"));

//        Arrays.stream(applicationContext.getBeanDefinitionNames()).forEach(System.out::println);
    }
}
