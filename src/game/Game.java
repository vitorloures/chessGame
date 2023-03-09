package org.example;

import java.util.ArrayList;
import java.util.List;

public class Game {
    ArrayList<Player> players;
    Board board;
    List<MoveRecord> movesHistory;

    public Game() {

    }

    void reset() {

    }

    boolean hasEnded() {
        return false;
    }


}
