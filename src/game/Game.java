package chess.game;

import chess.components.Board;
import lombok.Getter;

import java.util.ArrayList;
import java.util.List;

public class Game {

    private static final String MORE_THAN_TWO_PLAYERS_EXCEPTION = "You are not allowed to set more than two chess players";
    @Getter
    private List<Player> players;
    private Board board;
    private List<MoveRecord> movesHistory;
    private PlayerColor playerOnTurn;


    public Game() {
        // TODO: Dependency injection using guice
        this.board = new Board();
        this.players = new ArrayList<Player>();
    }

    public void setPlayer(Player player){
        if(players.size() < 2) {
          Player newPlayer = new Player();
          players.add(newPlayer);
        }
        else {
            throw new RuntimeException(MORE_THAN_TWO_PLAYERS_EXCEPTION);
        }
    }

    public void reset() {

    }

    public boolean hasEnded() {
        return false;
    }


}
