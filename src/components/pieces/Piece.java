package chess.components.pieces;

import chess.game.PlayerColor;

public interface Piece {

    PlayerColor getColor();
    void getValidMoves();
    void moveTo();


}
