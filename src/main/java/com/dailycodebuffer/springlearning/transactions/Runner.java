package com.dailycodebuffer.springlearning.transactions;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class Runner implements CommandLineRunner {
    @Autowired
    private MyRepository myRepository;
    @Override
    public void run(String... args) throws Exception {
        User user = new User();
        user.setUsername("dailycodebuffer");
        myRepository.save(user);
    }
}
