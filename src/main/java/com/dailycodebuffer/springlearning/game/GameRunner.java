package com.dailycodebuffer.springlearning.game;

import lombok.Getter;
import lombok.Setter;

import static java.lang.StringTemplate.STR;

@Getter
@Setter
public class GameRunner {
    private final GamingConsole game;
    public GameRunner(GamingConsole marioGame) {
        this.game = marioGame;
    }

    public void run() {
        System.out.println(STR."Running game...");
        game.down();
        game.up();
        game.left();
        game.right();
    }
}
