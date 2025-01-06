package com.dailycodebuffer.springlearning.game2;

import lombok.Getter;
import lombok.Setter;

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
