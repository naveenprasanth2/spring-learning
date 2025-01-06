package com.dailycodebuffer.springlearning.game2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class GamingConfiguration {

    @Bean
    public GamingConsole packMan(){
        return new PackMan();
    }

    @Bean
    public GameRunner gameRunner(ApplicationContext applicationContext){
        return new GameRunner(applicationContext.getBean("packMan", PackMan.class));
    }

    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(GamingConfiguration.class);
        context.getBean(GameRunner.class).run();

    }
}
