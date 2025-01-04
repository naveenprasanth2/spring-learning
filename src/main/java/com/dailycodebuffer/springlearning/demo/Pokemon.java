package com.dailycodebuffer.springlearning.demo;

import org.springframework.stereotype.Component;

@Component
public class Pokemon implements Game{
    @Override
    public void left() {
        System.out.println("Pokemon left");
    }

    @Override
    public void right() {
        System.out.println("Pokemon right");
    }

    @Override
    public void up() {
        System.out.println("Pokemon up");
    }

    @Override
    public void down() {
        System.out.println("Pokemon down");
    }
}
