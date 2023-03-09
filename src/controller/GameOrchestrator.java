package chess.controller;

import org.example.Game;

public class GameOrchestrator {
    private Game game;

    public GameOrchestrator(){
        this.game = new Game();
    }

    public void play(){
        game.reset();
    }


}
