import GameBoard.GameBoard;
import Pieces.OtherPiece;
import Pieces.Rook;

public class Main {

    public static void main(String[] args) {
        GameBoard gameBoard = new GameBoard();
        Rook rook = new Rook("d2");
        gameBoard.putPieceToSquare("d2", rook);
        gameBoard.putPieceToSquare("d3", new OtherPiece());
        rook.movePieceInBoard(gameBoard);
        System.out.println(rook.getListMovements());
    }
}
