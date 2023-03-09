package org.example;

import java.util.ArrayList;
import java.util.List;

public class Game {
    Player[] players;
    Board board;
    List<MoveRecord> movesHistory;
    PlayerColor playerOnTurn;


    public Game() {
        // TODO: Dependency injection using guice
        this.players = new Player[2];
        this.board = new Board();
    }

    public void reset() {

    }

    boolean hasEnded() {
        return false;
    }


}
