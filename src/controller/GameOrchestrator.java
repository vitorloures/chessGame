package chess.controller;

import chess.game.Game;
import chess.game.Player;
import chess.game.PlayerColor;

import java.util.List;

public class GameOrchestrator {
    private Game game;

    // TODO: Dependency Injection
    public GameOrchestrator(){
        this.game = new Game();
    }

    public void play(){
        game.reset();
    }

    private void insertGamePlayers() {
        Player player1 = createPlayer();
        Player player2 = createPlayer();
        PlayerColor colorPlayer1 = getInputColorPlayer();
        game.setPlayer(player1);
        game.setPlayer(player2);
    }

    private PlayerColor getInputColorPlayer() {

        List<Player> playerList = game.getPlayers();
        Player player1 = playerList.get(0);
        System.out.println("Insert player (" +  player1.getName() + ") color:");
        System.out.println("Press B to black, or W to White");

        String color = getUserInput().toUpperCase();
        while(!InputIsBlackOrWhite(color)) {
            System.out.println("Press B to black, or W to White");
            color = getUserInput().toUpperCase();
        }

        switch (color) {
            case "B":
                return PlayerColor.BLACK;
            case "W":
                return PlayerColor.WHITE;
            default:
                throw new RuntimeException("Invalid State. Player color should de black or white");
        }
    }

    private boolean InputIsBlackOrWhite(String color) {
        final String black = "B";
        final String white = "W";

        boolean blackOrWhite = color.equals(black) || color.equals(white);
        if(!blackOrWhite) {
            System.out.println("You input " + color + " , but only B and W is acceptable. Pay attention, man!");
        }
        return blackOrWhite;
    }

    private Player createPlayer() {
        Player player = new Player();
        String playerName = getUserInput();
        player.setName(playerName);
        return player;
    }

    private String getUserInput() {
        return System.in.toString();
    }


}
