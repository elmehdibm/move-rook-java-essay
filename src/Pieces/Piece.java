package Pieces;

import GameBoard.GameBoard;

import java.util.List;

public interface Piece {
    public List<String> movePieceInBoard(GameBoard gameBoard);
    public String formatResult();
}
