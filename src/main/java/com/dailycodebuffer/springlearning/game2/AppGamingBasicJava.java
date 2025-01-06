package com.dailycodebuffer.springlearning.game2;


public class AppGamingBasicJava {
    public static void main(String[] args) {
//        var game = new MarioGame();
        var game = new PackMan();
//        var game = new SuperContraGame();
        var gameRunner = new GameRunner(game);
        gameRunner.run();
    }
}
