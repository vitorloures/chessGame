package org.example.pieces;

import org.example.PlayerColor;

public interface Piece {

    PlayerColor getColor();
    void getValidMoves();
    void moveTo();


}
