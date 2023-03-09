package chess.controller;

public class Main {
    public static void main(String[] args) {
        System.out.println("Program started!");

        GameOrchestrator gameOrchestrator = new GameOrchestrator();
        gameOrchestrator.play();
    }
}