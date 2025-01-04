package com.dailycodebuffer.springlearning.demo;

import org.springframework.stereotype.Component;

@Component
public class MarioGame implements Game {

    @Override
    public void left() {
        System.out.println("Going left");
    }

    @Override
    public void right() {
        System.out.println("Going right");
    }

    @Override
    public void up() {
        System.out.println("Jump up");
    }

    @Override
    public void down() {
        System.out.println("Jump down");
    }
}
